package com.gestcantine.GestCantineADA.services.implementations;

import com.gestcantine.GestCantineADA.dtos.PlatDTO;
import com.gestcantine.GestCantineADA.models.Plat;
import com.gestcantine.GestCantineADA.repositories.PlatRepository;
import com.gestcantine.GestCantineADA.services.contracts.IPlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatService implements IPlatService {
    private final PlatRepository platRepository ;
    public List<Plat> getAllPlats() {
        return platRepository.findAll();
    }

    public Plat createPlat(Plat plat) {
        return platRepository.save(plat);
    }

    public Plat getPlatById(Long id) {
        return platRepository.findById(id).orElse(null);
    }

    public void deletePlat(Long id) {
        platRepository.deleteById(id);
    }

}
