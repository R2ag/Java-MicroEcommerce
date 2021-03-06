package com.rlag.ecommerce.checkout.service;

import com.rlag.ecommerce.checkout.entity.CheckoutEntity;
import com.rlag.ecommerce.checkout.repository.CheckoutRepository;
import com.rlag.ecommerce.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
