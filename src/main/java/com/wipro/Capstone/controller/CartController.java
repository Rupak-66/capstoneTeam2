package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CartRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @PostMapping("/addCart")
    public ResponseEntity<Void> addCart(@RequestBody CartRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCart/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateCart/{id}")
    public ResponseEntity<Void> updateCart(@PathVariable String id, @RequestBody CartRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getCart/{id}")
    public ResponseEntity<Void> getCart(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}