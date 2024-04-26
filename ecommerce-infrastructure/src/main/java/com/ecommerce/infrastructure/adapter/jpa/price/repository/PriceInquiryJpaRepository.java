package com.ecommerce.infrastructure.adapter.jpa.price.repository;

import com.ecommerce.infrastructure.adapter.jpa.price.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface PriceInquiryJpaRepository extends JpaRepository<PriceEntity, Long> {

    @Query("SELECT p FROM PriceEntity p where p.brandId = ?1 and p.productId = ?2 and ?3 between p.startDate and p.endDate order by p.priority desc limit 1")
    Optional<PriceEntity> getFinalPrice(Long brandId, Long productId, LocalDateTime data);

}