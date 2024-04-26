package com.ecommerce.bootloader.test.price;

import com.ecommerce.application.price.service.impl.PriceInquiryServiceImpl;
import com.ecommerce.domain.price.exception.PriceInquiryInvalidParameterException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class PriceInquiryServiceTest {

    @InjectMocks
    private PriceInquiryServiceImpl priceInquiryService;

    @Test
    void testPriceInquiryInvalidParameterException() {
        assertThrows(PriceInquiryInvalidParameterException.class, () -> {
            priceInquiryService.getFinalPrice(null, null,null);
        });
    }

}