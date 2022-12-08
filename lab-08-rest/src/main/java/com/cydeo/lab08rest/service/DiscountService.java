package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.entity.Discount;
import com.cydeo.lab08rest.enums.DiscountType;

import java.math.BigDecimal;
import java.util.List;

public interface DiscountService {

    Discount findFirstByName(String name);

    List<Discount> findAllByDiscountGreaterThan(BigDecimal amount);

    List<Discount> findAllByDiscountType(DiscountType discountType);

    List<Discount> findAllByRangeBetweenAmount(BigDecimal startAmount, BigDecimal endAmount);
}
