package com.ITcoffee.CoffeeShop.controllers;

import com.ITcoffee.CoffeeShop.models.Users;
import com.ITcoffee.CoffeeShop.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping ("/blog")
    public String blogMain (Model model){
        Iterable<Users>  users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "blog-main";
    }
}
