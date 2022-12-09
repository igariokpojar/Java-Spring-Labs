package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.ProductDTO;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    List<ProductDTO> retrieveListProduct();

    ProductDTO updateProduct(ProductDTO productDTO);

    ProductDTO createProduct(ProductDTO productDTO);

   List<ProductDTO> retrieveProductByCategoryAndPrice(List<Long> categoryList, BigDecimal price);

    ProductDTO retrieveProductByName(String name);

    List<ProductDTO> retrieveProductByTop3ProductByPrice();

    Integer countProductByPrice(BigDecimal price);

    List<ProductDTO> retrieveProductByPriceAndQuantity(BigDecimal price, Integer quantity);

    List<ProductDTO> getByCategory(Long categoryId);

}
