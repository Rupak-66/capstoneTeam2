package com.wipro.Capstone.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteLineItemDto {
    private String cartId;
    private String lineItemId;
}
