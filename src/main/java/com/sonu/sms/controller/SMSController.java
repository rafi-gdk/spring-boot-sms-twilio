package com.sonu.sms.controller;

import com.sonu.sms.request.MessageRequest;
import com.sonu.sms.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @Autowired
    SMSService service;

    @PostMapping(value = "/sendSMS")
    public String sendSMS(@RequestBody MessageRequest request) {
        return service.sendSMS(request);
    }
}