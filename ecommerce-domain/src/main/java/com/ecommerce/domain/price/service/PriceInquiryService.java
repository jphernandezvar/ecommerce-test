package com.ecommerce.domain.price.service;

import com.ecommerce.domain.price.model.Price;

import java.time.LocalDateTime;

public interface PriceInquiryService {

    Price getFinalPrice(Long brandId, Long productId, LocalDateTime applicationDate);

}
