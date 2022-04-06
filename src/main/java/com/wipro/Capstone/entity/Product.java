package com.wipro.Capstone.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double productPrice;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss.SSS",timezone = "IST")
    @CreatedDate
    private Date createdDate;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss.SSS",timezone = "IST")
    @LastModifiedDate
    private Date modifiedDate;
}
