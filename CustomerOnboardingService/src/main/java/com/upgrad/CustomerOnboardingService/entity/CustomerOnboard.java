package com.upgrad.CustomerOnboardingService.entity;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document
public class CustomerOnboard {
    private String CustomerId;
    private String CoreBankingCustomerId;
    private String CustomerMobileNumber;
    private LocalDate CustomerDateOfBirth;
}
