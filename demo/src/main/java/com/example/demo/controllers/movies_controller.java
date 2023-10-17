package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoviesController {

    @GetMapping("/movies")
    public String showMovies(Model model) {
        // Add any data you want to pass to the template using `model.addAttribute(...)`
        return "movies";
    }
}
