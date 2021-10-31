package com.sonu.sms.util;

import com.sonu.sms.request.MessageRequest;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SMSServiceTwilio {

    public static String sendSMS(MessageRequest request) {
        Twilio.init(request.getAccountSID(), request.getAuthToken());
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(request.getTrgtPhoneNumber()),//The phone number you are sending text to
                        new com.twilio.type.PhoneNumber(request.getSrcPhoneNumber()),//The Twilio phone number
                        request.getMessage())
                .create();
        return message.getStatus().toString();
    }
}