package com.example.Client.feignclient;

import com.example.Client.dto.CreditDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Credit", url = "http://localhost:8082/credit-service/credits")
public interface CreditClient {
    @GetMapping("/{creditId}")
    public CreditDto getClientByCustomerId(@PathVariable Long creditId);

}
