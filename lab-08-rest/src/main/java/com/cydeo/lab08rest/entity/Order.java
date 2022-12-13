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
    private Payment payment;/*
    You have to put this cascade all out to your parent tables. Then, when you try to figure out when you try to put or change the data in different from different table, then it's gonna affect all
things. you know the main purpose of cascade. All was. If you change something you need to change related database
field, right? So that's why it's giving error, and it's Push me to put cascade all fields
     */
}
