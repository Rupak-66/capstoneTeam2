package com.wipro.Capstone.service;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.response.CustomerResponseDto;

public interface CustomerService {
    void addCustomer(CustomerRequestDto customerRequestDto);
    void deleteCustomer(String id);
    CustomerResponseDto updateCustomerAddress(String id, CustomerRequestDto customerRequestDto);
    CustomerResponseDto getCustomer(String id);
}
