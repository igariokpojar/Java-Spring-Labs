package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.entity.Customer;

import java.util.List;

public interface CustomerService {
    CustomerDTO findById(Long customerId);

    List<CustomerDTO> getCustomerList();

    void update(CustomerDTO customerDTO);

    void save(CustomerDTO customerDTO);

    CustomerDTO retrieveByCustomerEmail(String email);

}
