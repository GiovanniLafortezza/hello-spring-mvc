package org.lessons.java.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String home(Model model) {
        Random random = new Random();
        int randomNumber = random.nextInt(1,7);
        model.addAttribute("randomNumber", randomNumber);
        return "home";
    }
}
