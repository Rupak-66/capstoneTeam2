package com.wipro.Capstone.service;

import com.wipro.Capstone.dto.requests.DeleteLineItemDto;
import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.entity.LineItem;

public interface LineItemService {
    LineItem addLineItem(LineItemRequestDto lineItemRequestDto);
    void deleteLineItem(DeleteLineItemDto deleteLineItemDto);
    LineItem getLineItem(String id);
    LineItem updateLineItem(LineItemRequestDto lineItemRequestDto);
}
