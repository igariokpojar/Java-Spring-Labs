package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.entity.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> findById(Long id);

    Customer retrieveByCustomerEmail(String email);
}
