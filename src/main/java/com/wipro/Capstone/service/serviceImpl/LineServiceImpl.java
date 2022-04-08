package com.wipro.Capstone.service.serviceImpl;

import com.wipro.Capstone.dto.mapper.ProductToLineItemMapper;
import com.wipro.Capstone.dto.requests.DeleteLineItemDto;
import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.entity.LineItem;
import com.wipro.Capstone.exception.ProductNotFoundException;
import com.wipro.Capstone.repository.CartRepository;
import com.wipro.Capstone.repository.LineItemRepository;
import com.wipro.Capstone.service.LineItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LineServiceImpl implements LineItemService {

    private final LineItemRepository lineItemRepository;
    private final ProductToLineItemMapper productToLineItemMapper;
    private final CartRepository cartRepository;

    @Override
    public LineItem addLineItem(LineItemRequestDto lineItemRequestDto) {
        return lineItemRepository.save(productToLineItemMapper.ProductToDto(lineItemRequestDto));
    }

    @Override
    public void deleteLineItem(DeleteLineItemDto deleteLineItemDto) {
        lineItemRepository.deleteById(deleteLineItemDto.getLineItemId());
        cartRepository.deleteLineItem(deleteLineItemDto);
    }

    @Override
    public LineItem getLineItem(String id) {
        return lineItemRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found with ID "+id));
    }

    @Override
    public LineItem updateLineItem(LineItemRequestDto lineItemRequestDto) {
        return lineItemRepository.save(productToLineItemMapper.ProductToDto(lineItemRequestDto));
    }
}
