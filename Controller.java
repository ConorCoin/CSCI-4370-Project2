package com.example.controller;

import com.example.model.Item;
import com.example.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CombinedController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String home(Model model) {
        // Add any logic or data to be passed to the template
        return "home";
    }

    @GetMapping("/items")
    public String itemList(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "item_list";
    }

    @GetMapping("/items/{id}")
    public String itemDetail(@PathVariable Long id, Model model) {
        Item item = itemService.getItemById(id);
        model.addAttribute("item", item);
        return "item_detail";
    }

    // Add other methods for creating, updating, and deleting items

}
