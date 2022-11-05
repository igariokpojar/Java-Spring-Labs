package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Costumer,Long> {
}
