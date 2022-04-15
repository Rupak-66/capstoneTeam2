package com.wipro.Capstone.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinalItem {
    private String _id;
    private String cartId;
    private String productId;
    private String productName;
    private int quantity;
    private Double price;

}
