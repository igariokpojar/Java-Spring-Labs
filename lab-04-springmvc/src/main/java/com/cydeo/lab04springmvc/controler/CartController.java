package com.cydeo.lab04springmvc.controler;

import com.cydeo.lab04springmvc.model.CartItem;
import com.cydeo.lab04springmvc.service.CartService;
import com.cydeo.lab04springmvc.service.impl.CartServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.*;
@Controller
public class CartController {

    private final CartService cartService; // inject the CartService

    public CartController(CartService cartService) {
        this.cartService = cartService;

    }

    @RequestMapping(value = "/cart/detail")
    public String cartDetails(String name, String productId,Double productPrice,Integer quantity,Model model){
        model.addAttribute("name", name);
        model.addAttribute("productId",productId);
        model.addAttribute("productPrice",productPrice);
        model.addAttribute("quantity",quantity);
        return "cart/cart-detail";
    }

    @RequestMapping("/cart-list/{cartId}")
    public String listOfCartItems(@PathVariable UUID cartId, Model model) {

        model.addAttribute("cartItemList",cartService.retrieveCartDetail(cartId));
        return "cart/cart-detail";

    }
    @RequestMapping( "/cart-list")
    public String cartList(CartServiceImpl cart,  Model model){

    model.addAttribute("cartList", cartService.retrieveCartList());
      return "cart/cart-list";
    }

}
