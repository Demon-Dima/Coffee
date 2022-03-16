package com.ITcoffee.CoffeeShop.controllers;

import com.ITcoffee.CoffeeShop.models.Users;
import com.ITcoffee.CoffeeShop.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @Autowired
    private UsersRepository usersRepository;


    @GetMapping("/sign-up")
    public String signUp( Model model) {
        model.addAttribute("title", "Sign Up");
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String signUpPost(@RequestParam String user_first_name,
                             @RequestParam String user_last_name,
                             @RequestParam String user_email_address,
                             @RequestParam String user_password,
                             Model model
    ){
        Users user = new Users(user_first_name, user_last_name, user_email_address, user_password, false);
        usersRepository.save(user);
        return "home";
    }


}
