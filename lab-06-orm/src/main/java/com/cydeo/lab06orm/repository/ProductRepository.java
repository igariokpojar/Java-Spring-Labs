package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
