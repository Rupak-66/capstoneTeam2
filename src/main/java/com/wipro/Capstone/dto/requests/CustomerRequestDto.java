package com.wipro.Capstone.dto.requests;

import com.wipro.Capstone.entity.CustomerAddress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDto {
    private String customerName;
    private String customerEmail;
    private CustomerAddressRequestDto customerBillingAddress;
    private CustomerAddressRequestDto customerShippingAddress;
}
