package com.wipro.Capstone.service;

import com.wipro.Capstone.dto.requests.LineItemRequestDto;

public interface CartService {
    void addToCart(LineItemRequestDto lineItemRequestDto);
}
