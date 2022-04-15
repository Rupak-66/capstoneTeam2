package com.wipro.Capstone.service;

import com.wipro.Capstone.entity.Order;

public interface OrderService {
    Order addOrder(String itemId);
    void cancelOrder(String id);
    void getOrder();
}
