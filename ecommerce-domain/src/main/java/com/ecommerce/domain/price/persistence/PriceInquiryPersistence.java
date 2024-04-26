package com.ecommerce.domain.price.persistence;

import com.ecommerce.domain.price.model.Price;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PriceInquiryPersistence {

    Optional<Price> getFinalPrice(Long brandId, Long productId, LocalDateTime applicationDate);

}
