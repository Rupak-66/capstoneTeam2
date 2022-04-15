package com.wipro.Capstone.service.serviceImpl;

import com.wipro.Capstone.dto.mapper.OrderMapper;
import com.wipro.Capstone.dto.response.OrderResponse;
import com.wipro.Capstone.entity.Order;
import com.wipro.Capstone.repository.CartRepository;
import com.wipro.Capstone.repository.OrderRepository;
import com.wipro.Capstone.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

    private CartRepository cartRepository;
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    @Override
    public Order addOrder(String lineItemId) {
        OrderResponse orderResponse = cartRepository.findByLineItem(lineItemId);
        return orderRepository.save(orderMapper.DtoToEntity(orderResponse.getOrderItems().get(0)));
    }

    @Override
    public void cancelOrder(String id) {
        orderRepository.findByIdAndDelete(id);
    }

    @Override
    public void getOrder() {

    }
}
