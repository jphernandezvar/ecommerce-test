package com.ecommerce.infrastructure.adapter.jpa.price.mapper;

import com.ecommerce.domain.price.model.Price;
import com.ecommerce.infrastructure.adapter.jpa.price.entity.PriceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PriceEntityMapper {

    @Mapping(source = "brandId", target = "brand.id")
    @Mapping(source = "productId", target = "product.id")
    @Mapping(source = "priceList", target = "priceList.id")
    @Mapping(source = "price", target = "finalPrice")
    @Mapping(source = "currency", target = "currency.isoCode")
    Price toDomain(PriceEntity entity);

}
