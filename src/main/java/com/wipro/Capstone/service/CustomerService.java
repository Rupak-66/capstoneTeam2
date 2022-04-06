package com.wipro.Capstone.service;

import com.wipro.Capstone.dto.requests.CustomerDetailsUpdateDto;
import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.response.CustomerResponseDto;

public interface CustomerService {
    void addCustomer(CustomerRequestDto customerRequestDto);
    void deleteCustomer(String id);
    CustomerResponseDto updateCustomerAddress(String id, CustomerDetailsUpdateDto customerDetailsUpdateDto);
    CustomerResponseDto getCustomer(String id);
}
