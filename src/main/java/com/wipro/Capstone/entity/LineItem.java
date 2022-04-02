package com.wipro.Capstone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "lineItems")
public class LineItem {
    @Id
    private String id;
    private String productId;
    private String productName;
    private String quantity;
    private Double price;
}
