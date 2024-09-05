package com.gestcantine.GestCantineADA.services.implementations;

import com.gestcantine.GestCantineADA.dtos.PlatDTO;
import com.gestcantine.GestCantineADA.mapping.contracts.IPlatMapper;
import com.gestcantine.GestCantineADA.models.Menu;
import com.gestcantine.GestCantineADA.models.Plat;
import com.gestcantine.GestCantineADA.repositories.PlatRepository;
import com.gestcantine.GestCantineADA.services.contracts.IPlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlatService implements IPlatService {
    private final IPlatMapper platMapper;
    private final PlatRepository platRepository ;

    @Override
    public List<PlatDTO> getAllPlats() {
        return platRepository.findAll().stream().map(platMapper::toDto).toList();
    }

    @Override
    public PlatDTO createPlat(PlatDTO plat) {
        Plat platDomain = platMapper.toEntity(plat);
        platDomain = platRepository.save(platDomain);
        return platMapper.toDto(platDomain);
    }

    @Override
    public Optional<PlatDTO> getPlatById(Long id) {
        return platRepository.findById(id).map(platMapper::toDto);
    }

    @Override
    public PlatDTO updatePlat(Long id, PlatDTO plat) {
        return null;
    }

    @Override
    public void deletePlat(Long id) {
        platRepository.deleteById(id);

    }
}
