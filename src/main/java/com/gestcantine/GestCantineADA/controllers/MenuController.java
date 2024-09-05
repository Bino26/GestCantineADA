package com.gestcantine.GestCantineADA.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus")
public class MenuController {

    @GetMapping
    public String displayHomePage(){
        return "pages/menus";
    }
}
