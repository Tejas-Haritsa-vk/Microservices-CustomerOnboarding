package com.upgrad.CoreBankingACL.controller;

import com.upgrad.CoreBankingACL.model.CustomerOnboardRequestVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreBankingACLController {

    @GetMapping("/v1/validateCustomer")
    public ResponseEntity<String> validateCustomer(@RequestParam CustomerOnboardRequestVO customerOnboardRequestVO) {
        return ResponseEntity.ok(customerOnboardRequestVO.getCustomerId());
    }
}
