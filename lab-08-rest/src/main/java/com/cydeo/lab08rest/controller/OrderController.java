package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.enums.PaymentMethod;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getOrderList() {
        return ResponseEntity
                .ok(new ResponseWrapper("Orders are successfully retrieved",
                        orderService.getOrderList(), HttpStatus.OK));
    }
//    @PutMapping
//    public ResponseEntity<ResponseWrapper> updateOrder(@RequestBody OrderDTO orderDTO) {
//
//        return ResponseEntity.ok(new ResponseWrapper("Orders are successfully updated"
//                , orderService.updateOrder(orderDTO), HttpStatus.OK));
//    }


    @PostMapping
    public ResponseEntity<ResponseWrapper> createOrder(@RequestBody OrderDTO orderDTO) {
        OrderDTO dto = orderService.save(orderDTO);
        return ResponseEntity.ok(new ResponseWrapper("Order are successfully create", orderService.save(dto), HttpStatus.OK));

    }
    @GetMapping("/paymentMethod/{paymentMethod}")
    public ResponseEntity<ResponseWrapper>getOrderListByPaymentMethod(@PathVariable PaymentMethod paymentMethod){

        return ResponseEntity.ok(new ResponseWrapper("Orders are successfully retrieved"
                ,orderService.getOrderListByPaymentMethod(paymentMethod),HttpStatus.OK));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<ResponseWrapper>getOrderListByEmail(@PathVariable String email)throws Exception {

        return ResponseEntity.ok(new ResponseWrapper("Orders are successfully retrieved"
                , orderService.getOrderListByEmail(email), HttpStatus.OK));
    }
}
