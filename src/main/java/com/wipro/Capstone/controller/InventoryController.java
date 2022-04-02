package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.CustomerRequestDto;
import com.wipro.Capstone.dto.requests.InventoryRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @PostMapping("/addInventory")
    public ResponseEntity<Void> addInventory(@RequestBody InventoryRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteInventory/{id}")
    public ResponseEntity<Void> deleteInventory(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateInventory/{id}")
    public ResponseEntity<Void> updateInventory(@PathVariable String id, @RequestBody InventoryRequestDto customerRequestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getInventory/{id}")
    public ResponseEntity<Void> getInventory(@PathVariable String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
