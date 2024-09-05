package com.gestcantine.GestCantineADA.controllers;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.dtos.PlatDTO;
import com.gestcantine.GestCantineADA.services.implementations.PlatService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/plats")
public class PlatController {

    private final PlatService platService ;
    @GetMapping
    public String displayMenuPage(){
        return "pages/menus";
    }

    @GetMapping("/add")
    public String showAddPMenuPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        model.addAttribute("menu", new MenuDTO());
        return "pages/forms";
    }

    @PostMapping
    public String createPlat(PlatDTO plat){
        platService.createPlat(plat);
        return "redirect:/plats";
    }

    @GetMapping("/{id}")
    public String showUpdatePlatForm(HttpServletRequest request, Model model, @PathVariable Long id){
        String currentUrl = request.getRequestURI();
        Optional<PlatDTO> plat = platService.getPlatById(id);
        model.addAttribute("currentUrl", currentUrl);
        if(plat.isPresent()){
            model.addAttribute("menu", plat.get());
            return "pages/forms";
        }else {
            return "redirect:/plats";
        }
    }

    @PostMapping("/delete/{id}")
    public String deletePlat(@PathVariable Long id){
        platService.deletePlat(id);
        return "redirect:/plats";
    }

}
