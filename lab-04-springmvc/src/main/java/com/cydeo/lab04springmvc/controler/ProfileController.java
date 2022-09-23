package com.cydeo.lab04springmvc.controler;

import com.cydeo.lab04springmvc.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String retrieveProfile(Model model){
        Profile profile = new Profile(); // create an object profile and pass the data
        profile.setName("Igariok");
        profile.setSurname("Alexandru");
        profile.setUserName("007");
        profile.setEmail("jamesbond@gmail.com");
        profile.setPhoneNumber("007007007");
        profile.setCreatedDate(LocalDateTime.now());
        model.addAttribute("profile",profile);

        return "profile/profile-info";
    }
}
