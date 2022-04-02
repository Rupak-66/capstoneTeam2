package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @PostMapping("/addCustomer")
    public ResponseEntity<Void> addCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<Void> updateCustomer(@PathVariable String id, @RequestBody CustomerRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/deleteCustomer/{id}")
    public ResponseEntity<Void> searchCustomer(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
