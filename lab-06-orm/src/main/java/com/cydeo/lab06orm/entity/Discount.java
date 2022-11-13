package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Entity
//@Table(name = "discounts")
@NoArgsConstructor
public class Discount extends BaseEntity{

    private String name;

    private BigDecimal discount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;







}
