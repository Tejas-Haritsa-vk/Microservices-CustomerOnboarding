package com.upgrad.CustomerOnboardingService.service;

import com.upgrad.CustomerOnboardingService.entity.CustomerOnboard;
import com.upgrad.CustomerOnboardingService.model.CoreBankingResponseVO;
import com.upgrad.CustomerOnboardingService.model.CustomerOnboardResponseVO;
import com.upgrad.CustomerOnboardingService.repository.CustomerOnboardingRepository;
import org.springframework.stereotype.Service;


@Service
public class CustomerOnboardingService {

    private CustomerOnboardingRepository repository;

    public CustomerOnboardingService(CustomerOnboardingRepository repository){
        this.repository = repository;
    }

    public CoreBankingResponseVO CustomerOnboardingService(CustomerOnboardResponseVO customerOnboardResponseVO) {

        repository.save(CustomerOnboard
                .builder()
                .CustomerId(customerOnboardResponseVO.getCustomerId())
                .CustomerMobileNumber(customerOnboardResponseVO.getCustomerMobileNumber())
                .CustomerDateOfBirth(customerOnboardResponseVO.getCustomerDateOfBirth())
                .build());

        return CoreBankingResponseVO
                .builder()
                .CoreBankingCustomerId(customerOnboardResponseVO.getCustomerId())
                .build();
    }
}