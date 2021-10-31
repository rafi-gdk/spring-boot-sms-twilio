package com.sonu.sms.service;

import com.sonu.sms.request.MessageRequest;
import com.sonu.sms.util.SMSServiceTwilio;
import org.springframework.stereotype.Service;

@Service
public class SMSService {

    public String sendSMS(MessageRequest request) {
        String status = SMSServiceTwilio.sendSMS(request);
        if (status.equalsIgnoreCase("QUEUED")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}