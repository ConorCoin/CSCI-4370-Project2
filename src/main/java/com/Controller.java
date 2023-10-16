package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello from the backend!");
        return "index";
    }
}
