package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.entity.Address;
import com.cydeo.lab08rest.entity.Customer;

import java.util.List;

public interface AddressService {

    List<Address> findAllByCustomer(Customer customer);

    Address findByStreet(String street);

    List<Address> findTop3ByCustomer_Email(String email);

    List<Address> findAllByCustomerAndName(Customer customer, String name);

    List<Address> findAllByStreetStartingWith(String keyword);

    List<Address> retrieveByCustomerId(Long id);
}
