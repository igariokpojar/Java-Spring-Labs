package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
//@Table(name = "orders")
@NoArgsConstructor
public class Orders extends BaseEntity{

     private BigDecimal paidPrice;
     private BigDecimal totalPrice;

     @ManyToOne(fetch = FetchType.LAZY)
     private Customer customer;

     @OneToOne(fetch = FetchType.LAZY)
     private Payment payment;

     @OneToOne(fetch = FetchType.LAZY)
     private Cart cart;
}
