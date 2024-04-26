package com.ecommerce.domain.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCatalog {

    GENERIC_ERROR("ERR_GEN_001", "An unexpected error occurred"),
    INVALID_PARAMETERS("ERR_GEN_002", "Invalid parameters"),
    
    PRICE_NOT_FOUND("ERR_PRICE_001", "Price not found"),
    PRICE_INQUIRY_INVALID_PARAMETERS("ERR_PRICE_002", "Invalid parameters for price inquiry");

    private final String code;
    private final String message;

}