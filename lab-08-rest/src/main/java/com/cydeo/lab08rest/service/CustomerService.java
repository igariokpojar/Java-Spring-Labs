package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {


    CustomerDTO findById(Long id);

    List<CustomerDTO> getCustomerList();

    void save(CustomerDTO customerDTO);

    void update(CustomerDTO customerDTO);

    CustomerDTO retrieveByCustomerEmail(String email);
}
