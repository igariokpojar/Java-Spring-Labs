package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.enums.PaymentMethod;

import java.util.List;

public interface OrderService {
   List<OrderDTO> getOrderList();

  // OrderDTO updateOrder(OrderDTO orderDTO);

    OrderDTO save(OrderDTO orderDTO);

    List<OrderDTO> getOrderListByPaymentMethod(PaymentMethod paymentMethod);

    List<OrderDTO> getOrderListByEmail(String email)throws Exception;

    OrderDTO update(OrderDTO orderDTO);
}
