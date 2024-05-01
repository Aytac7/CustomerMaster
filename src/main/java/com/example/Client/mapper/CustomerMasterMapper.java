package com.example.Client.mapper;

import com.example.Client.dto.CustomerMasterDto;
import com.example.Client.entity.CustomerMasterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public  interface CustomerMasterMapper {



     CustomerMasterDto entityMapToDto(CustomerMasterEntity customerMasterEntity);
     CustomerMasterEntity dtoMapToEntity(CustomerMasterDto  customerMasterDto );


}
