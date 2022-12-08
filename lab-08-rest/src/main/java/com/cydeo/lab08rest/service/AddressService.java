package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.AddressDTO;
import com.cydeo.lab08rest.entity.Address;
import com.cydeo.lab08rest.entity.Customer;

import java.util.List;

public interface AddressService {

    List<AddressDTO> getAddressList();
    AddressDTO save(AddressDTO addressDTO);
    AddressDTO update(AddressDTO addressDTO);
    List<AddressDTO> getAddressListByStartsWithAddress(String address);
    List<AddressDTO> getAddressListByCustomerId(Long customerId);
    List<AddressDTO> getAddressListByCustomerAndName(Long customerId, String addressName);
}
