package com.ecommerce.infrastructure.adapter.rest.price.advice;

import com.ecommerce.domain.common.model.ErrorCatalog;
import com.ecommerce.domain.price.exception.PriceInquiryInvalidParameterException;
import com.ecommerce.domain.price.exception.PriceNotFoundException;
import com.ecommerce.infrastructure.adapter.rest.common.model.response.ErrorResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Collections;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PriceControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PriceNotFoundException.class)
    public ErrorResponse handlePriceNotFoundException(PriceNotFoundException exception) {
        return ErrorResponse.builder()
                .code(ErrorCatalog.PRICE_NOT_FOUND.getCode())
                .message(ErrorCatalog.PRICE_NOT_FOUND.getMessage())
                .details(Collections.singletonList(exception.getMessage()))
                .timestamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PriceInquiryInvalidParameterException.class)
    public ErrorResponse handlePriceInvalidParameterException(PriceInquiryInvalidParameterException exception) {
        return ErrorResponse.builder()
                .code(ErrorCatalog.PRICE_INQUIRY_INVALID_PARAMETERS.getCode())
                .message(ErrorCatalog.PRICE_INQUIRY_INVALID_PARAMETERS.getMessage())
                .details(Collections.singletonList(exception.getMessage()))
                .timestamp(LocalDateTime.now())
                .build();
    }

}
