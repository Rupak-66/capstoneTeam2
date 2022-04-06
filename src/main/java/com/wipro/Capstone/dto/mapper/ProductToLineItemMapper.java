package com.wipro.Capstone.dto.mapper;

import com.wipro.Capstone.dto.requests.LineItemRequestDto;
import com.wipro.Capstone.entity.LineItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class ProductToLineItemMapper {

    @Mappings({
           @Mapping(target = "id", ignore = true),
           @Mapping(target = "productId", source = "product.id"),
           @Mapping(target = "price", source = "product.productPrice"),
           @Mapping(target = "quantity", source = "quantity"),
    })
    public abstract LineItem ProductToDto(LineItemRequestDto lineItemRequestDto);
}
