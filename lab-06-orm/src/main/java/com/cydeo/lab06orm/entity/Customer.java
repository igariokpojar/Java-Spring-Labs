package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
//@Table(name = "customer")
public class Customer extends BaseEntity {


    private String email;
    private String firstName;
    private String lastName;
    private String userName;

//    @OneToOne(mappedBy = "customer")
//    private Balance balance;


}
