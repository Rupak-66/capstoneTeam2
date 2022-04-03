package com.wipro.Capstone.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customerAddresses")
public class CustomerAddress{
    @Id
    private String id;
    @NotBlank(message = "Doorno. can't be blank")
    private String doorNo;
    private String streetName;
    private String layout;
    @NotBlank(message = "City name can't be blank")
    private String city;
    @NotEmpty(message = "PinCode can't be empty")
    @Size(min = 6, max = 6, message = "Please enter 6 digit PINCODE")
    private String pinCode;
    @CreatedDate
    private Date createdDate;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss.SSS",timezone = "IST")
    @LastModifiedDate
    private Date modifiedDate;
}
