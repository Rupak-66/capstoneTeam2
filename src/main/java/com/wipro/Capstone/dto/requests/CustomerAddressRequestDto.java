package com.wipro.Capstone.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddressRequestDto {
    private String doorNo;
    private String streetName;
    private String layout;
    private String city;
    private String pinCode;
}
