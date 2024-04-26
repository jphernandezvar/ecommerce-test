package com.ecommerce.infrastructure.adapter.rest.price.mapper;

import com.ecommerce.domain.price.model.Price;
import com.ecommerce.infrastructure.adapter.rest.price.model.response.PriceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PriceRestMapper {

    @Mapping(source = "brand.id", target = "brandId")
    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "priceList.id", target = "priceList")
    @Mapping(source = "finalPrice", target = "price")
    PriceResponse toResponse(Price price);

}
