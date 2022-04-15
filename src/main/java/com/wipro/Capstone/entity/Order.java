package com.wipro.Capstone.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String orderId;
    @NotEmpty(message = "Cart id can't be empty or null")
    private String cartId;
    @NotEmpty(message = "LineItem id can't be empty or null")
    private String lineItemId;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS", timezone = "IST")
    @CreatedDate
    private Date createdDate;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS", timezone = "IST")
    @LastModifiedDate
    private Date modifiedDate;
}
