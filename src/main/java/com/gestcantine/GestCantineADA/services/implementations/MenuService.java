package com.gestcantine.GestCantineADA.services.implementations;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.mapping.contracts.IMenuMapper;
import com.gestcantine.GestCantineADA.models.Menu;
import com.gestcantine.GestCantineADA.repositories.MenuRepository;
import com.gestcantine.GestCantineADA.services.contracts.IMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MenuService implements IMenuService {
    private final IMenuMapper menuMapper ;
    private  final MenuRepository menuRepository;


    @Override
    public List<MenuDTO> getAllMenus() {
        return menuRepository.findAll().stream().map(menuMapper::toDto).toList();
    }

    @Override
    public MenuDTO createMenu(MenuDTO menu) {
        Menu menuDomain = menuMapper.toEntity(menu);
        menuDomain = menuRepository.save(menuDomain);
        return menuMapper.toDto(menuDomain);
    }

    @Override
    public Optional<MenuDTO> getMenuById(Long id) {
        return menuRepository.findById(id).map(menuMapper::toDto);
    }

    @Override
    public MenuDTO updateMenu(Long id, MenuDTO menu) {
        return null;
    }

    @Override
    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);

    }
}
