package com.upgrad.CustomerOnboardingService.Controller;

import com.upgrad.CustomerOnboardingService.model.CustomerOnboardRequestVO;
import com.upgrad.CustomerOnboardingService.service.CustomerOnboardingService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOnboardingController {

    private CustomerOnboardingService service;

    public CustomerOnboardingController(CustomerOnboardingService service) {
        this.service = service;
    }

    @PostMapping("/v1/onboardCustomer")
    public ResponseEntity<String> onboardCustomer(@RequestBody CustomerOnboardRequestVO customerOnboardRequest) {
        return ResponseEntity.ok("Customer Onboarded");
    }

}
