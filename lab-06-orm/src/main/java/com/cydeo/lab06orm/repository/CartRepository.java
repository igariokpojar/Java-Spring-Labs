package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
