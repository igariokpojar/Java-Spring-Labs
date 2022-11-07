package com.cydeo.lab06orm.repository;


import com.cydeo.lab06orm.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Long> {
}
