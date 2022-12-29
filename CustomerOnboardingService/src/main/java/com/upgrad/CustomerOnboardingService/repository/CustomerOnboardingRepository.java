package com.upgrad.CustomerOnboardingService.repository;

import com.upgrad.CustomerOnboardingService.entity.CustomerOnboard;
import com.upgrad.CustomerOnboardingService.service.CustomerOnboardingService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerOnboardingRepository extends MongoRepository<CustomerOnboard, String> {
}
