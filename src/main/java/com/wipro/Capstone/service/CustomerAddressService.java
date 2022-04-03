package com.wipro.Capstone.service;

import com.wipro.Capstone.dto.requests.CustomerAddressRequestDto;
import com.wipro.Capstone.dto.response.CustomerAddressResponseDto;

public interface CustomerAddressService {
    void addCustomerAddress(CustomerAddressRequestDto customerAddressRequestDto);
    void deleteCustomerAddress(String id);
    CustomerAddressResponseDto updateCustomerAddress(String id, CustomerAddressRequestDto customerAddressRequestDto);
    CustomerAddressResponseDto getCustomerAddress(String id);
}
