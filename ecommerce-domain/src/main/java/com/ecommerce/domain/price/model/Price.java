package com.ecommerce.domain.price.model;

import com.ecommerce.domain.brand.model.Brand;
import com.ecommerce.domain.currency.model.Currency;
import com.ecommerce.domain.pricelist.model.PriceList;
import com.ecommerce.domain.product.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Price {

    private Long id;
    private Brand brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PriceList priceList;
    private Product product;
    private Integer priority;
    private BigDecimal finalPrice;
    private Currency currency;

}
