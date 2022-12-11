package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getCustomerList() {
        return ResponseEntity.ok(new ResponseWrapper("Costumers are successfully retrieved"
                , customerService.getCustomerList(), HttpStatus.OK));
    }
    @PutMapping
    public ResponseEntity<ResponseWrapper> updateCustomer(@RequestBody CustomerDTO customerDTO) {

        customerService.update(customerDTO);
        return ResponseEntity.ok(new ResponseWrapper("Customer is successfully updated"
                ,HttpStatus.OK));
    }
    @PostMapping
    public ResponseEntity<ResponseWrapper> create(@RequestBody CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return ResponseEntity.ok(new ResponseWrapper("Costumer are successfully created"
                , HttpStatus.OK));
    }
    @GetMapping("/{email}")
    public ResponseEntity<ResponseWrapper> getCustomerByEmail(@PathVariable("email") String email){

        CustomerDTO customerDTO = customerService.retrieveByCustomerEmail(email);

        return ResponseEntity.ok(new ResponseWrapper("Customer is successfully retrieved",customerDTO,HttpStatus.OK));

    }
}
