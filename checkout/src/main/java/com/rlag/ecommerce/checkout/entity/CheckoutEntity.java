package com.rlag.ecommerce.checkout.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    public Status status;

    public enum Status{
        CREATED,
        APPROVED
    }
}
