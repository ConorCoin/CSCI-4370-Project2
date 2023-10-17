package com.example.controllers;

import com.example.repositories.CastMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CastMembersController {

    @Autowired
    private CastMemberRepository castMemberRepository;

    @GetMapping("/castMembers")
    public String showCastMembers(Model model) {
        model.addAttribute("castMembers", castMemberRepository.findAll());
        return "cast_members";
    }
}
