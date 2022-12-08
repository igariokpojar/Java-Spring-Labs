package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.entity.Address;
import com.cydeo.lab08rest.entity.Order;
import com.cydeo.lab08rest.enums.PaymentMethod;

import java.util.List;

public interface OrderService {

      List<OrderDTO> createOrderList();

      List<OrderDTO> getOrderListByPaymentMethod(PaymentMethod paymentMethod);

      List<OrderDTO> getOrderListByEmail(String email) throws Exception;

      OrderDTO save(OrderDTO orderDTO);

      OrderDTO update(OrderDTO orderDTO);




}
