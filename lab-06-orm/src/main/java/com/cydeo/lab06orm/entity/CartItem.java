package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
//@Table(name = "cart_items")
@NoArgsConstructor
public class CartItem extends BaseEntity{

    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne//(fetch = FetchType.LAZY)
    private Cart cart;


}
