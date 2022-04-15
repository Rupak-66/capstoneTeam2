package com.wipro.Capstone.dto.mapper;

import com.wipro.Capstone.dto.requests.OrderRequestDto;
import com.wipro.Capstone.dto.response.FinalItem;
import com.wipro.Capstone.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.UUID;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {

    @Mappings({
            @Mapping(target = "orderId", expression = "java(generateUuid())"),
            @Mapping(target = "lineItemId", source = "_id")
    })
    public abstract Order DtoToEntity(FinalItem finalItem);

    public String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
