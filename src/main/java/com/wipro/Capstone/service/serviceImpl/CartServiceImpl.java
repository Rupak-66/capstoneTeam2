package com.wipro.Capstone.service.serviceImpl;

import com.wipro.Capstone.dto.mapper.ProductToLineItemMapper;
import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.entity.Cart;
import com.wipro.Capstone.entity.LineItem;
import com.wipro.Capstone.repository.CartRepository;
import com.wipro.Capstone.repository.LineItemRepository;
import com.wipro.Capstone.service.CartService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CartServiceImpl implements CartService {

    private final ProductToLineItemMapper productToLineItemMapper;
    private final CartRepository cartRepository;
    private final LineItemRepository lineItemRepository;

    @Override
    public void addToCart(LineItemRequestDto lineItemRequestDto) {
        LineItem lineItem = lineItemRepository.save(productToLineItemMapper.ProductToDto(lineItemRequestDto));
        cartRepository.updateLineItem(lineItem);
    }
}
