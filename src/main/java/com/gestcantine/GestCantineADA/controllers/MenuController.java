package com.gestcantine.GestCantineADA.controllers;


import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.services.implementations.MenuService;
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
@RequestMapping("/menus")
public class MenuController {
    private final MenuService menuService ;

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
    public String createMenu(MenuDTO menu){
        menuService.createMenu(menu);
        return "redirect:/menus";
    }

    @GetMapping("/{id}")
    public String showUpdateMenuForm(HttpServletRequest request, Model model, @PathVariable Long id){
        String currentUrl = request.getRequestURI();
        Optional<MenuDTO> menu = menuService.getMenuById(id);
        model.addAttribute("currentUrl", currentUrl);
        if(menu.isPresent()){
            model.addAttribute("menu", menu.get());
            return "pages/forms";
        }else {
            return "redirect:/menus";
        }
    }

    @PostMapping("/delete/{id}")
    public String deleteMenu(@PathVariable Long id){
        menuService.deleteMenu(id);
        return "redirect:/menus";
    }


}
