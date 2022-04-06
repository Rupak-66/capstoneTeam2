package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CartRequestDto;
import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.service.CartService;
import com.wipro.Capstone.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@AllArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/addCart")
    public ResponseEntity<Void> addCart(@RequestBody LineItemRequestDto lineItemRequestDto){
        cartService.addToCart(lineItemRequestDto);
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