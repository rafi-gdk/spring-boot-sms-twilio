package com.sonu.sms.service;

import com.sonu.sms.request.MessageRequest;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

@Service
public class SMSService {

    public String sendSMS(MessageRequest request) {
        Twilio.init(request.getAccountSID(), request.getAuthToken());
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(request.getTrgtPhoneNumber()),//The phone number you are sending text to
                        new com.twilio.type.PhoneNumber(request.getSrcPhoneNumber()),//The Twilio phone number
                        request.getMessage())
                .create();
        if (message.getStatus().toString().equalsIgnoreCase("QUEUED")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}