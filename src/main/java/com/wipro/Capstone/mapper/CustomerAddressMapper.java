package com.wipro.Capstone.mapper;

import com.wipro.Capstone.dto.requests.CustomerAddressRequestDto;
import com.wipro.Capstone.dto.response.CustomerAddressResponseDto;
import com.wipro.Capstone.entity.CustomerAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class CustomerAddressMapper {

    @Mappings({
            @Mapping(target = "createdDate", ignore = true),
            @Mapping(target = "modifiedDate", ignore = true)
    })
    public abstract CustomerAddress DtoToEntity(CustomerAddressRequestDto customerAddressRequestDto);

    public abstract CustomerAddressResponseDto EntityToDto(CustomerAddress customerAddress);

}
