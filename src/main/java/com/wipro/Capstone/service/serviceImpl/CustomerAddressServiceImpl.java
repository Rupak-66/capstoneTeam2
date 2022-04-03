package com.wipro.Capstone.service.serviceImpl;

import com.wipro.Capstone.dto.mapper.CustomerAddressMapper;
import com.wipro.Capstone.dto.requests.CustomerAddressRequestDto;
import com.wipro.Capstone.dto.response.CustomerAddressResponseDto;
import com.wipro.Capstone.entity.CustomerAddress;
import com.wipro.Capstone.exception.CustomerAddressNotFoundException;
import com.wipro.Capstone.repository.CustomerAddressRepository;
import com.wipro.Capstone.service.CustomerAddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerAddressServiceImpl implements CustomerAddressService {

    private final CustomerAddressRepository customerAddressRepository;
    private final CustomerAddressMapper customerAddressMapper;

    @Override
    public void addCustomerAddress(CustomerAddressRequestDto customerAddressRequestDto) {
        CustomerAddress customerAddress = customerAddressMapper.DtoToEntity(customerAddressRequestDto);
        customerAddressRepository.save(customerAddress);
    }

    @Override
    public void deleteCustomerAddress(String id) {
        customerAddressRepository.deleteById(id);
    }

    @Override
    public CustomerAddressResponseDto updateCustomerAddress(String id, CustomerAddressRequestDto customerAddressRequestDto) {
        CustomerAddress address = customerAddressRepository.findById(id).orElseThrow(() -> new CustomerAddressNotFoundException("No Address found with ID: " + id));
        CustomerAddress customerAddress = customerAddressMapper.DtoToEntity(customerAddressRequestDto);
        customerAddress.setId(id);
        customerAddress.setCreatedDate(address.getCreatedDate());
        return customerAddressMapper.EntityToDto(customerAddressRepository.save(customerAddress));
    }

    @Override
    public CustomerAddressResponseDto getCustomerAddress(String id) {
        CustomerAddress customerAddress = customerAddressRepository.findById(id).orElseThrow(() -> new CustomerAddressNotFoundException("No Address found with ID: " + id));
        return customerAddressMapper.EntityToDto(customerAddress);
    }
}
