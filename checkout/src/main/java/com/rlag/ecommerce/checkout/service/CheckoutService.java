package com.rlag.ecommerce.checkout.service;

import com.rlag.ecommerce.checkout.entity.CheckoutEntity;
import com.rlag.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
