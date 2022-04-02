package com.wipro.Capstone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String customerName;
    @Email(message = "Please enter valid email address")
    @Indexed(unique = true)
    private String customerEmail;
    @DBRef
    private CustomerAddress customerBillingAddress;
    @DBRef
    private CustomerAddress customerShippingAddress;
}
