package com.gestcantine.GestCantineADA.controllers;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.dtos.PlatDTO;
import com.gestcantine.GestCantineADA.services.implementations.PlatService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/plats")
public class PlatController {

    private final PlatService platService ;
    @GetMapping
    public String displayPlatPage(){
        return "plats/plats";
    }

    @GetMapping("/add")
    public String showAddPlatPage(Model model){
        model.addAttribute("plat", new PlatDTO());
        return "plats/forms";
    }

    @PostMapping
    public String createPlat( PlatDTO plat){
        platService.createPlat(plat);
        return "redirect:/plats";
    }

    @GetMapping("/{id}")
    public String showUpdatePlatForm( Model model, @PathVariable Long id){
        Optional<PlatDTO> plat = platService.getPlatById(id);
        if(plat.isPresent()){
            model.addAttribute("plat", plat.get());
            return "pages/forms";
        }else {
            return "redirect:/plats";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deletePlat(@PathVariable Long id){
        platService.deletePlat(id);
        return "redirect:/plats";
    }



}
