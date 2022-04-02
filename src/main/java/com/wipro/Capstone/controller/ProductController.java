package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.requests.ProductRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping("/addProduct")
    public ResponseEntity<Void> addProduct(@RequestBody ProductRequestDto productRequestDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable String id, @RequestBody ProductRequestDto productRequestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Void> getProduct(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
