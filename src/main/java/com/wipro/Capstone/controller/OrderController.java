package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.OrderRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @PostMapping("/addOrder")
    public ResponseEntity<Void> addOrder(@RequestBody OrderRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateOrder/{id}")
    public ResponseEntity<Void> updateOrder(@PathVariable String id, @RequestBody OrderRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<Void> getOrder(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
