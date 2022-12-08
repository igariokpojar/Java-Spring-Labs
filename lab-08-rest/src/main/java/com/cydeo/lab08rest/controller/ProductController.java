package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.repository.ProductRepository;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> listProduct() {

        return ResponseEntity
                .ok(new ResponseWrapper("Products are successfully retrieved"
                        , productService.retrieveListProduct(), HttpStatus.OK));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateProduct(@RequestBody ProductDTO productDTO) {

        return ResponseEntity.ok(new ResponseWrapper("Product are successfully updated"
                , productService.updateProduct(productDTO), HttpStatus.OK));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createProduct(@RequestBody ProductDTO productDTO) {

        return ResponseEntity.ok(new ResponseWrapper("Product are successfully created"
                , productService.createProduct(productDTO), HttpStatus.OK));
    }

//    @PostMapping("/categoryandprice")
//    public ResponseEntity<ResponseWrapper> retrieveProductByCategoryAndPrice(@RequestBody ProductDTO productDTO) {
//
//        return ResponseEntity.ok(new ResponseWrapper("Product are successfully retrieve"
//                , productService.retrieveProductByCategoryAndPrice(productDTO), HttpStatus.OK));
//    }



}
