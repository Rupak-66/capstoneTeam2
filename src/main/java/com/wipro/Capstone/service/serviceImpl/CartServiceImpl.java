package com.wipro.Capstone.service.serviceImpl;

import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.repository.CartRepository;
import com.wipro.Capstone.service.CartService;
import com.wipro.Capstone.service.LineItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CartServiceImpl implements CartService {

    private final LineItemService lineItemService;
    private final CartRepository cartRepository;

    @Override
    public void addToCart(LineItemRequestDto lineItemRequestDto) {
        cartRepository.updateLineItem(lineItemService.addLineItem(lineItemRequestDto));
    }
}
