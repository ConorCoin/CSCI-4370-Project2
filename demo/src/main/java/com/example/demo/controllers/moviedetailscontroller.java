package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MovieDetailsController {

    @GetMapping("/movieDetails/{movieId}")
    public String showMovieDetails(@PathVariable Long movieId, Model model) {
        // Logic to retrieve movie details based on movieId
        // You can use a MovieRepository or a service to retrieve the details
        // Example:
        // Movie movie = movieRepository.findById(movieId).orElse(null);
        // model.addAttribute("movie", movie);
        
        // For this example, let's assume you have a "movie" object with details
        // You can replace this with actual logic to retrieve movie details
        model.addAttribute("movie", new Movie()); // Assuming you have a Movie class

        return "movie_details";
    }
}
