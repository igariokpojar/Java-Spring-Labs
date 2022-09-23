package com.cydeo.lab04springmvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LogInController {

    @RequestMapping("/login/{email}/{phoneNumber}")
    public String logIn(@PathVariable String phoneNumber,@PathVariable String email, Model model){

        model.addAttribute("email",email);
        model.addAttribute("phoneNumber",phoneNumber);
        model.addAttribute("loginMessage","Hello World");

        return "login/login-info";
    }


}
