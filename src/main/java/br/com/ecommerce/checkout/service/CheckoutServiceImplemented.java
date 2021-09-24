package br.com.ecommerce.checkout.service;

import br.com.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ecommerce.checkout.repository.CheckoutRepository;
import br.com.ecommerce.checkout.resource.checkout.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutServiceImplemented implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }
}
