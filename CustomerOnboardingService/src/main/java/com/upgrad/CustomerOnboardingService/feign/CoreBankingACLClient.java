package com.upgrad.CustomerOnboardingService.feign;

import com.upgrad.CustomerOnboardingService.model.CoreBankingResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="CoreBanking-ACL-Client", url = "${acl-client-url}")
public interface CoreBankingACLClient {

//    @GetMapping("/v1/corebanking/acl-client")
//    public CoreBankingResponseVO corebankingaclclient {@RequestParam String core};
}
