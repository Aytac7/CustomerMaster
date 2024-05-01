package com.example.Client.controller;

import com.example.Client.dto.CustomerMasterDto;
import com.example.Client.service.CustomerMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerMasters")
@RequiredArgsConstructor
public class CustomerMasterController {
    public final CustomerMasterService customerMasterService;

    @GetMapping("{id}")
    public CustomerMasterDto getCustomer(@PathVariable Long id){
       return customerMasterService.getCustomerMasterById(id);
    }

}
