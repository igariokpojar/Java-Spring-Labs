package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemsRepository extends JpaRepository<CartItem,Long> {
}
