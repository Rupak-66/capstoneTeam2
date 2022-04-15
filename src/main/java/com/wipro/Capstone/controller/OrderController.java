package com.wipro.Capstone.controller;

import com.wipro.Capstone.dto.requests.OrderRequestDto;
import com.wipro.Capstone.dto.response.FinalItem;
import com.wipro.Capstone.dto.response.OrderResponse;
import com.wipro.Capstone.entity.Cart;
import com.wipro.Capstone.entity.Order;
import com.wipro.Capstone.repository.CartRepository;
import com.wipro.Capstone.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
@Slf4j
public class OrderController {

    private OrderService orderService;

    @PostMapping("/addOrder")
    public ResponseEntity<Order> addOrder(@RequestBody OrderRequestDto orderRequestDto){
        return new ResponseEntity<>(orderService.addOrder(orderRequestDto.getLineItemId()), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable String id){
        orderService.cancelOrder(id);
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
