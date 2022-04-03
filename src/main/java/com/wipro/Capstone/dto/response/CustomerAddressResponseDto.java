package com.wipro.Capstone.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddressResponseDto {
    private String doorNo;
    private String streetName;
    private String layout;
    private String city;
    private String pinCode;
}
