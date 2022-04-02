package com.wipro.Capstone.service;

import com.wipro.Capstone.dto.requests.CustomerAddressRequestDto;
import com.wipro.Capstone.entity.CustomerAddress;
import com.wipro.Capstone.mapper.CustomerAddressMapper;
import com.wipro.Capstone.repository.CustomerAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerAddressService {

    private final CustomerAddressRepository customerAddressRepository;
    private final CustomerAddressMapper customerAddressMapper;

    public void addCustomerAddress(CustomerAddressRequestDto customerAddressRequestDto){
        CustomerAddress customerAddress = customerAddressMapper.DtoToEntity(customerAddressRequestDto);
        customerAddressRepository.save(customerAddress);
    }
}
