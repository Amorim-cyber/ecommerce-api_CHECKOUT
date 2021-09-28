package br.com.ecommerce.checkout.service;

import br.com.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ecommerce.checkout.repository.CheckoutRepository;
import br.com.ecommerce.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImplemented implements CheckoutService{

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
