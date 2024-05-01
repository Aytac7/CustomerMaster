package com.example.Client.service;

import com.example.Client.dto.CreditDto;
import com.example.Client.dto.CustomerMasterDto;
import com.example.Client.entity.CustomerMasterEntity;
import com.example.Client.feignclient.CreditClient;
import com.example.Client.mapper.CustomerMasterMapper;
import com.example.Client.repository.CustomerMasterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerMasterService {
    private final CustomerMasterRepository customerMasterRepository;
    private  final CustomerMasterMapper customerMasterMapper;
    private  final CreditClient creditClient;
    public CustomerMasterDto getCustomerMasterById(Long id){
//       CustomerMasterEntity customerEntity= customerMasterRepository.findById(id).orElseThrow(()->new RuntimeException());
//       CustomerMasterDto mapDto=customerMasterMapper.entityMapToDto(customerEntity);
//       return mapDto;
     CustomerMasterEntity  customerMasterEntity=customerMasterRepository.findById(id).orElseThrow(()->new RuntimeException());
      var customerMasterDto=customerMasterMapper.entityMapToDto(customerMasterEntity);
    CreditDto creditDto=creditClient.getClientByCustomerId(id);
    customerMasterDto.setCreditDto(creditDto);
    creditDto.setCustomerId(id);

    return  customerMasterDto;

    }
}
