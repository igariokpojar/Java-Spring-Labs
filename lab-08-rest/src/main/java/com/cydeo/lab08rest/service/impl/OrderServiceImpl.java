package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.PaymentDTO;
import com.cydeo.lab08rest.entity.*;
import com.cydeo.lab08rest.enums.PaymentMethod;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.OrderRepository;
import com.cydeo.lab08rest.service.CustomerService;
import com.cydeo.lab08rest.service.OrderService;
import com.cydeo.lab08rest.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final MapperUtil mapperUtil;

    public OrderServiceImpl(OrderRepository orderRepository, MapperUtil mapperUtil) {
        this.orderRepository = orderRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<OrderDTO> getOrderList() {
        return orderRepository.findAll().stream().map(order ->
                        mapperUtil.convert(order, new OrderDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        Order order = mapperUtil.convert(orderDTO, new Order());
        orderRepository.save(order);
        return orderDTO;
    }

    @Override
    public List<OrderDTO> getOrderListByPaymentMethod(PaymentMethod paymentMethod) {
        List<Order> orderList = orderRepository.findAllByPayment_PaymentMethod(paymentMethod);
        return orderList.stream().map(order -> mapperUtil
                .convert(order, new OrderDTO())).collect(Collectors.toList());
    }

    @Override
    public List<OrderDTO> getOrderListByEmail(String email) throws Exception {
        boolean hasEmail = orderRepository.existsByCustomer_email(email);

        if (hasEmail) {
            List<Order> orderList = orderRepository.findAllByCustomer_Email(email);
            return orderList.stream().map(order -> mapperUtil
                    .convert(order, new OrderDTO())).collect(Collectors.toList());
        }
        throw new Exception("Email no found : " + email);
    }
}
 //   @Override
//    public OrderDTO updateOrder(OrderDTO orderDTO) {
//
//        Order order = orderRepository.findById(orderDTO.getId()).orElseThrow();
//
//        order.setPaidPrice(orderDTO.getPaidPrice());
//        order.setTotalPrice(orderDTO.getTotalPrice());
//
//
//        CustomerDTO customerDTO = customerService.findById(orderDTO.getCustomerId());
//
//        Customer customer = mapperUtil.convert(customerDTO, new Customer());
//        order.setCustomer(customer);
//
//
//        PaymentDTO paymentDTO = paymentService.findById(orderDTO.getPaymentId());
//
//        order.setPayment(mapperUtil.convert(paymentDTO, new Payment()));
//
//
//        CartDto cartDto = cartService.findById(orderDTO.getCartId());
//        Cart cart = mapperUtil.convert(cartDto, new Cart());
//        order.setCart(cart);
//
//        orderRepository.save(order);
//
//
//        return mapperUtil.convert(order, new OrderDTO());
//
//    }






