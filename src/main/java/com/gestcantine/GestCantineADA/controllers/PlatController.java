package com.gestcantine.GestCantineADA.controllers;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.dtos.PlatDTO;
import com.gestcantine.GestCantineADA.services.implementations.PlatService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/plats")
public class PlatController {

    private final PlatService platService ;
    @GetMapping
    public String displayPlatPage(Model model){
        model.addAttribute("plats",platService.getAllPlats());
        return "plats/plats";
    }

    @GetMapping("/add")
    public String showAddPlatPage(Model model){
        model.addAttribute("plat", new PlatDTO());
        return "plats/forms";
    }

    @GetMapping("/search")
    public String searchPlats(@RequestParam(value = "name", required = false) String name, Model model) {
        List<PlatDTO> plats;

        if (name != null && !name.isEmpty()) {
            plats = platService.searchPlatsByName(name);
        } else {
            plats = platService.getAllPlats();
        }

        model.addAttribute("searchTerm", plats);
        return "plats/listbyname";
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

    @PostMapping("/delete/{id}")
    public String deletePlat(@PathVariable Long id){
        platService.deletePlat(id);
        return "redirect:/plats";
    }



}
