package com.gestcantine.GestCantineADA.controllers;


import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.services.implementations.MenuService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/menus")
public class MenuController {
    private final MenuService menuService ;

    @GetMapping
    public String displayMenuPage(Model model){
        model.addAttribute("menus",menuService.getAllMenus());
        return "pages/menus";
    }

    @GetMapping("/add")
    public String showAddPMenuPage(Model model){
        model.addAttribute("menu", new MenuDTO());
        return "pages/forms";
    }

    @PostMapping
    public String createMenu(MenuDTO menu){
        menuService.createMenu(menu);
        return "redirect:/menus";
    }

    @GetMapping("/{id}")
    public String showUpdateMenuForm(Model model, @PathVariable Long id){
        Optional<MenuDTO> menu = menuService.getMenuById(id);
        if(menu.isPresent()){
            model.addAttribute("menu", menu.get());
            return "pages/forms";
        }else {
            return "redirect:/menus";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMenu(@PathVariable Long id){
        menuService.deleteMenu(id);
        return "redirect:/menus";
    }


}
