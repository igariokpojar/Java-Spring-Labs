package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount,Long> {
}
