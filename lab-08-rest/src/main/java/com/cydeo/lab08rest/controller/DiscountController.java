package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.DiscountDTO;
import com.cydeo.lab08rest.entity.Discount;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.service.DiscountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/discount")
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper>getAllDiscounts(){
        return ResponseEntity.ok(new ResponseWrapper("Discount are successfully retrieved"
                ,discountService.getDiscountList(), HttpStatus.OK));
    }
    @PutMapping
    public ResponseEntity<ResponseWrapper> updateDiscount(@RequestBody DiscountDTO discountDTO){
        discountService.update(discountDTO);
        return ResponseEntity.ok(new ResponseWrapper("Discount is successfully updated",HttpStatus.OK));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createDiscount(@RequestBody DiscountDTO discountDTO){
        discountService.save(discountDTO);
        return ResponseEntity.ok(new ResponseWrapper("Discount is successfully created",HttpStatus.OK));
    }
    @GetMapping("{name}")
    public ResponseEntity<ResponseWrapper>getDiscountListByName(@PathVariable("name")String name) {
        DiscountDTO discountDTO = discountService.retrieveDiscountByName(name);
        return ResponseEntity.ok(new ResponseWrapper("Customer is successfully retrieved", discountDTO, HttpStatus.OK));
    }
}
