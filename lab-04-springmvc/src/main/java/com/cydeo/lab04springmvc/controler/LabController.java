package com.cydeo.lab04springmvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {
    @RequestMapping("/lab2")
    public String labList( Model model) {
//        String firstLab = "lab-00-coupling";
//        String secondLab = "lab-01-ioc";
//        String thirdLab = "lab-02-di";
//        String fourthLab = "lab-03-springboot";
//        String fifthLab = "lab-04-springmvc";

        // or we can do in this way
        model.addAttribute("firstLab","lab-00-coupling");
        model.addAttribute("secondLab","lab-01-ioc");
        model.addAttribute("thirdLab","lab-02-di");
        model.addAttribute("fourthLab","lab-03-springboot");
        model.addAttribute("fifeLab","lab-04-springmvc");

       return "lab/lab-list";

    }
}
