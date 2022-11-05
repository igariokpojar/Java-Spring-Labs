package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Costumer extends BaseEntity {


    private String email;
    private String first_name;
    private String last_name;
    private String user_name;

    @OneToOne
    private Balance balance;
}
