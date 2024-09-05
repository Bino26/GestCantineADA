package com.gestcantine.GestCantineADA.mapping.implementations;

import com.gestcantine.GestCantineADA.dtos.MenuDTO;
import com.gestcantine.GestCantineADA.dtos.PlatDTO;
import com.gestcantine.GestCantineADA.mapping.contracts.IPlatMapper;
import com.gestcantine.GestCantineADA.models.Menu;
import com.gestcantine.GestCantineADA.models.Plat;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlatMapper implements IPlatMapper {
    private ModelMapper modelMapper ;

    @Override
    public PlatDTO toDto(Plat entity) {
        return modelMapper.map(entity, PlatDTO.class);
    }

    @Override
    public Plat toEntity(PlatDTO dto) {
        return modelMapper.map(dto, Plat.class);
    }
}
