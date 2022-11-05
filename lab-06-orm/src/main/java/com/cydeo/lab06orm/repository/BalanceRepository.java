package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<Balance,Long> {
}
