package com.gestcantine.GestCantineADA.mapping.implementations;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.mapping.contracts.IMenuMapper;
import com.gestcantine.GestCantineADA.models.Menu;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MenuMapper implements IMenuMapper {
    private final ModelMapper modelMapper ;
    @Override
    public MenuDTO toDto(Menu entity) {
        return modelMapper.map(entity, MenuDTO.class);

    }

    @Override
    public Menu toEntity(MenuDTO dto) {
        return modelMapper.map(dto, Menu.class);

    }
}
