package com.cgs.kubernetes.payment.controller;


import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cgs.kubernetes.payment.model.PaymentResponse;

@RestController
public class PaymentController {

    @PostMapping("/payment")
    public PaymentResponse pay(
    		@RequestParam(required = true,defaultValue = "Dummy") String user,
    		@RequestParam(required = true) String reference,
    		@RequestParam(required = true) int amount, 
    		@RequestParam(required = true, defaultValue="cash") String mode) {
    	
    	PaymentResponse response = new PaymentResponse();
    	response.setAuthCode(UUID.randomUUID().toString());
    	response.setReference(reference);
    	response.setStatus("success");
    	response.setType(mode);
        return response;
    }	
	
	
}
