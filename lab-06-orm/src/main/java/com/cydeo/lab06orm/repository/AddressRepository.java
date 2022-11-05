package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
