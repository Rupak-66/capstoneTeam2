package com.wipro.Capstone.dto.requests;

import com.wipro.Capstone.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineItemRequestDto {
    private Product product;
    private Integer quantity;
}
