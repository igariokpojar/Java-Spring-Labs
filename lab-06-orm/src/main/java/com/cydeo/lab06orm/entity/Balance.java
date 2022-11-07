package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.math.BigDecimal;


@Setter
@Getter
@Entity
@NoArgsConstructor
public class Balance extends BaseEntity{

    private BigDecimal amount;

  //  private String costumer_id;

    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
}
