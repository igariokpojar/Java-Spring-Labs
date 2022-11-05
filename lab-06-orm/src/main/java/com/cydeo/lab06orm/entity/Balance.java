package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Setter
@Getter
@Entity
@NoArgsConstructor
public class Balance extends BaseEntity{

    private Long amount;
    private String costumer_id;

    @OneToOne
    private Costumer costumer;
}
