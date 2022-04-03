package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CustomerAddressRequestDto;
import com.wipro.Capstone.dto.response.CustomerAddressResponseDto;
import com.wipro.Capstone.service.CustomerAddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customerAddress")
@AllArgsConstructor
public class CustomerAddressController {

    private final CustomerAddressService customerAddressService;

    @PostMapping("/addCustomerAddress")
    public ResponseEntity<Void> addCustomerAddress(@RequestBody CustomerAddressRequestDto customerAddressRequestDto){
        customerAddressService.addCustomerAddress(customerAddressRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCustomerAddress/{id}")
    public ResponseEntity<Void> deleteCustomerAddress(@PathVariable String id){
        customerAddressService.deleteCustomerAddress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateCustomerAddress/{id}")
    public ResponseEntity<CustomerAddressResponseDto> updateCustomerAddress(@PathVariable String id, @RequestBody CustomerAddressRequestDto customerAddressRequestDto){
        return new ResponseEntity<>(customerAddressService.updateCustomerAddress(id, customerAddressRequestDto),HttpStatus.OK);
    }

    @GetMapping("/getCustomerAddress/{id}")
    public ResponseEntity<CustomerAddressResponseDto> getCustomerAddress(@PathVariable String id){
        return new ResponseEntity<>(customerAddressService.getCustomerAddress(id), HttpStatus.OK);
    }
}
