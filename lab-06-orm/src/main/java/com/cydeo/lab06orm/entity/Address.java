package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String street;
    private String zipCode;

   // private String costumer_id;

    @ManyToOne //(fetch = FetchType.LAZY)
    private Customer customer;
}
