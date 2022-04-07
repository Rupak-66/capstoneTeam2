package com.wipro.Capstone.dto.mapper;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.response.CustomerResponseDto;
import com.wipro.Capstone.entity.Cart;
import com.wipro.Capstone.entity.Customer;
import com.wipro.Capstone.entity.CustomerAddress;
import com.wipro.Capstone.repository.CartRepository;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {

    @Autowired
    protected CartRepository cartRepository;

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "createdDate", ignore = true),
            @Mapping(target = "modifiedDate", ignore = true),
            @Mapping(target = "customerBillingAddress", source = "billingAddress" ),
            @Mapping(target = "customerShippingAddress", source = "shippingAddress" )
    })
    public abstract Customer DtoToEntity(CustomerRequestDto customerAddressRequestDto, CustomerAddress billingAddress,CustomerAddress shippingAddress, @Context CartRepository cartRepository);

    @AfterMapping
    protected void DtoToEntity( @MappingTarget Customer customer, @Context CartRepository cartRepository) {
        Cart cart = cartRepository.save(new Cart());
        customer.setCart(cart);
    }

    @Mappings({
            @Mapping(target = "id", source = "customer.id"),
            @Mapping(target = "customerBillingAddress.addressId", source = "customerBillingAddress.id"),
            @Mapping(target = "customerShippingAddress.addressId", source = "customerShippingAddress.id")
    })
    public abstract CustomerResponseDto EntityToDto(Customer customer);
}
