package com.rlag.ecommerce.checkout.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}
