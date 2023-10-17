package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddReviewController {

    @GetMapping("/addReview")
    public String showAddReviewPage() {
        return "add_review";
    }
}
