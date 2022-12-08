package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.DiscountDTO;
import com.cydeo.lab08rest.entity.Discount;
import com.cydeo.lab08rest.enums.DiscountType;

import java.math.BigDecimal;
import java.util.List;

public interface DiscountService {

    List<DiscountDTO> getDiscountList();

    void save(DiscountDTO discountDTO);

    void update(DiscountDTO discountDTO);

    DiscountDTO retrieveDiscountByName(String name);
}
