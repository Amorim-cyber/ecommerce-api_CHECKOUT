package br.com.ecommerce.checkout.repository;

import br.com.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<CheckoutEntity,Long> {
}
