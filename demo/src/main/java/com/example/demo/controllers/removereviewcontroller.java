package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RemoveReviewController {

    @GetMapping("/removeReview")
    public String showRemoveReviewPage() {
        return "remove_review";
    }
}
