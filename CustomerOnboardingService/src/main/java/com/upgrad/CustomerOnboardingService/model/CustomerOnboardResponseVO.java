package com.upgrad.CustomerOnboardingService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOnboardResponseVO {
    private String CustomerId;
    private String CoreBankingCustomerId;
    private String CustomerMobileNumber;
    private LocalDate CustomerDateOfBirth;
}
