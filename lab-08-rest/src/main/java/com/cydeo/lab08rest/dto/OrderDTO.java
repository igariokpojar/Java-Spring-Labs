package com.cydeo.lab08rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {
    private Long cartId;
    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    private Long customerId;
    private Long paymentId;
    private Long id;
}
