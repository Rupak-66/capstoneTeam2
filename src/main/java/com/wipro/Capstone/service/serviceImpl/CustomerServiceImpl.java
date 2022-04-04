package com.wipro.Capstone.service.serviceImpl;

import com.wipro.Capstone.dto.mapper.CustomerAddressMapper;
import com.wipro.Capstone.dto.mapper.CustomerMapper;
import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.response.CustomerResponseDto;
import com.wipro.Capstone.entity.Customer;
import com.wipro.Capstone.entity.CustomerAddress;
import com.wipro.Capstone.exception.CustomerNotFoundException;
import com.wipro.Capstone.repository.CustomerAddressRepository;
import com.wipro.Capstone.repository.CustomerRepository;
import com.wipro.Capstone.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;
    private final CustomerAddressRepository customerAddressRepository;
    private final CustomerAddressMapper customerAddressMapper;

    @Override
    public void addCustomer(CustomerRequestDto customerRequestDto) {
        CustomerAddress customerBillingAddress = customerAddressMapper.DtoToEntity(customerRequestDto.getCustomerBillingAddress());
        CustomerAddress customerShippingAddress = customerAddressMapper.DtoToEntity(customerRequestDto.getCustomerShippingAddress());
        CustomerAddress billingAddress = customerAddressRepository.save(customerBillingAddress);
        CustomerAddress shippingAddress = customerAddressRepository.save(customerShippingAddress);
        Customer customer = customerMapper.DtoToEntity(customerRequestDto, billingAddress, shippingAddress);
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {customerAddressRepository.deleteById(id);}

    @Override
    public CustomerResponseDto updateCustomerAddress(String id, CustomerRequestDto customerRequestDto) {
        return null;
    }

    @Override
    public CustomerResponseDto getCustomer(String id) {
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found with ID: "+id));
        return customerMapper.EntityToDto(customer);
    }
}
