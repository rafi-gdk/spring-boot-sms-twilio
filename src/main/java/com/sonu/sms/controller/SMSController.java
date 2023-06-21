package com.sonu.sms.controller;

import com.sonu.sms.request.MessageRequest;
import com.sonu.sms.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @Autowired
    SMSService service;

    @Autowired
    MessageRequest request;

    @GetMapping(value = "/sendSMS/{trgtPhoneNumber}/{message}")
    public String sendSMS(@PathVariable String trgtPhoneNumber, @PathVariable String message) {
        request.setTrgtPhoneNumber(trgtPhoneNumber);
        request.setMessage(message);
        return service.sendSMS(request);
    }
}