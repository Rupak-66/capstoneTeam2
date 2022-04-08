package com.wipro.Capstone.repository.CustomRepository;

import com.wipro.Capstone.dto.requests.DeleteLineItemDto;
import com.wipro.Capstone.entity.LineItem;

public interface CustomCartRepository {
    void updateLineItem(LineItem lineItem);
    void deleteLineItem(DeleteLineItemDto deleteLineItemDto);
}
