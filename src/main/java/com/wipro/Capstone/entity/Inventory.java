package com.wipro.Capstone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "inventories")
public class Inventory {
    @Id
    private String id;
    private String productId;
    @Size(min = 1, message = "Quantity can't be negative or zero")
    private int quantity;
}
