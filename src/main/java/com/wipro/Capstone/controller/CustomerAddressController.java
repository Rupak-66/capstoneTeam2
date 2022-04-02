package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CustomerAddressRequestDto;
import com.wipro.Capstone.service.CustomerAddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/customerAddress")
@AllArgsConstructor
public class CustomerAddressController {

    private final CustomerAddressService customerAddressService;

    @PostMapping("/addCustomerAddress")
    public ResponseEntity<Void> addCustomerAddress(@Valid @RequestBody CustomerAddressRequestDto customerAddressRequestDto){
        customerAddressService.addCustomerAddress(customerAddressRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCustomerAddress/{id}")
    public ResponseEntity<Void> deleteCustomerAddress(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateCustomerAddress/{id}")
    public ResponseEntity<Void> updateCustomerAddress(@PathVariable String id, @RequestBody CustomerAddressRequestDto CustomerAddressRequestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/deleteCustomerAddress/{id}")
    public ResponseEntity<Void> searchCustomerAddress(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}