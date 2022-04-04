package com.wipro.Capstone.dto.response;

import com.wipro.Capstone.entity.CustomerAddress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {
    private String id;
    private String customerName;
    private String customerEmail;
    private CustomerAddressResponseDto customerBillingAddress;
    private CustomerAddressResponseDto customerShippingAddress;
}
