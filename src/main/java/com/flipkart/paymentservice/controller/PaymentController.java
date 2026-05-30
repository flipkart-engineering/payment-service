package com.flipkart.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/health")
    public String health() {
        return "Payment Service is UP";
    }

    @GetMapping("/payment")
    public String payment() {
        return "Payment Processed Successfully";
    }
}
