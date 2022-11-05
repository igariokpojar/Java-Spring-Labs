package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zip_code;
    @Column(name = "costumer_Id",insertable = false,updatable = false)
    private String costumer_id;

    @ManyToOne
    private Costumer costumer;
}
