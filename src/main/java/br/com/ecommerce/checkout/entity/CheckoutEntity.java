package br.com.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
public class CheckoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public enum Status {
        CREATED,
        APPROVED
    }

}
