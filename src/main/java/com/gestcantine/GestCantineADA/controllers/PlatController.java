package com.gestcantine.GestCantineADA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plats")
public class PlatController {
    @GetMapping
    public String displayHomePage(){
        return "pages/plats";
    }
}
