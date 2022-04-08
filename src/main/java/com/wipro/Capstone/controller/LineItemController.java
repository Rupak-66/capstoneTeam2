package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.DeleteLineItemDto;
import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.entity.LineItem;
import com.wipro.Capstone.service.LineItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lineitem")
@AllArgsConstructor
public class LineItemController {

    private final LineItemService lineItemService;

    @PostMapping("/addLineitem")
    public ResponseEntity<Void> addCart(@RequestBody LineItemRequestDto lineItemRequestDto){
        lineItemService.addLineItem(lineItemRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteLineitem")
    public ResponseEntity<Void> deleteCart(@RequestBody DeleteLineItemDto deleteLineItemDto){
        lineItemService.deleteLineItem(deleteLineItemDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateLineitem")
    public ResponseEntity<LineItem> updateCart(@RequestBody LineItemRequestDto lineItemRequestDto){
        return new ResponseEntity<>(lineItemService.updateLineItem(lineItemRequestDto), HttpStatus.OK);
    }

    @GetMapping("/getLineitem/{id}")
    public ResponseEntity<LineItem> getCart(@PathVariable String id){
        return new ResponseEntity<>(lineItemService.getLineItem(id),HttpStatus.OK);
    }
}
