package com.gestcantine.GestCantineADA.services.implementations;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.models.Menu;
import com.gestcantine.GestCantineADA.repositories.MenuRepository;
import com.gestcantine.GestCantineADA.services.contracts.IMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MenuService implements IMenuService {

    private  final MenuRepository menuRepository;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu getMenuById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }


}
