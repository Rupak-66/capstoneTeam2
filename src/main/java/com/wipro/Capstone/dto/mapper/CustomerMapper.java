package com.wipro.Capstone.dto.mapper;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.response.CustomerResponseDto;
import com.wipro.Capstone.entity.Customer;
import com.wipro.Capstone.entity.CustomerAddress;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {
    public CustomerAddressMapper customerAddressMapper;

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdDate", ignore = true),
            @Mapping(target = "modifiedDate", ignore = true),
            @Mapping(target = "customerBillingAddress", source = "billingAddress" ),
            @Mapping(target = "customerShippingAddress", source = "shippingAddress" )
    })
    public abstract Customer DtoToEntity(CustomerRequestDto customerAddressRequestDto, CustomerAddress billingAddress,CustomerAddress shippingAddress);

    @Mappings({
            @Mapping(target = "id", source = "customer.id"),
            @Mapping(target = "customerBillingAddress.addressId", source = "customerBillingAddress.id"),
            @Mapping(target = "customerShippingAddress.addressId", source = "customerShippingAddress.id")
    })
    public abstract CustomerResponseDto EntityToDto(Customer customer);
}
