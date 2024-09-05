package com.gestcantine.GestCantineADA.services.contracts;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.models.Menu;

import java.util.List;
import java.util.Optional;

public interface IMenuService {

    List<MenuDTO> getAllMenus();
    MenuDTO createMenu(MenuDTO menu);
    Optional<MenuDTO> getMenuById(Long id);
    MenuDTO updateMenu(Long id, MenuDTO menu);
    void deleteMenu(Long id);
}
