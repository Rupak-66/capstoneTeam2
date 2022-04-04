package com.wipro.Capstone.dto.mapper;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.entity.Customer;
import com.wipro.Capstone.entity.CustomerAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdDate", ignore = true),
            @Mapping(target = "modifiedDate", ignore = true),
            @Mapping(target = "customerBillingAddress", source = "billingAddress" ),
            @Mapping(target = "customerShippingAddress", source = "shippingAddress" )
    })
    public abstract Customer DtoToEntity(CustomerRequestDto customerAddressRequestDto, CustomerAddress billingAddress,CustomerAddress shippingAddress);
/*
    @Mapping(target = "addressId", source = "id")
    public abstract CustomerResponseDto EntityToDto(Customer customerAddress);*/
}
