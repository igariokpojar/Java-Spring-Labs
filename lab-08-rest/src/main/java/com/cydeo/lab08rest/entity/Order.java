package com.cydeo.lab08rest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends BaseEntity{
    @OneToOne
    private Cart cart;
    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    @ManyToOne
    private Customer customer;
    @OneToOne(cascade = CascadeType.ALL) // (cascade = CascadeType.ALL)->this is for Transient error
    private Payment payment;
}
