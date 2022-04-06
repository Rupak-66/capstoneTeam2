package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CustomerDetailsUpdateDto;
import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.response.CustomerResponseDto;
import com.wipro.Capstone.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public ResponseEntity<Void> addCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        customerService.addCustomer(customerRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<CustomerResponseDto> updateCustomer(@PathVariable String id, @RequestBody CustomerDetailsUpdateDto customerDetailsUpdateDto){
        return new ResponseEntity<>(customerService.updateCustomerAddress(id, customerDetailsUpdateDto),HttpStatus.OK);
    }

    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<CustomerResponseDto> getCustomer(@PathVariable String id){
        return new ResponseEntity<>(customerService.getCustomer(id),HttpStatus.OK);
    }
}
