package com.gestcantine.GestCantineADA.services.contracts;

import com.gestcantine.GestCantineADA.dtos.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface IPlatService {

    List<PlatDTO> getAllPlats();
    PlatDTO createPlat(PlatDTO plat);
   Optional<PlatDTO>  getPlatById(Long id);
   List<PlatDTO> searchPlatsByName(String name);
    PlatDTO updatePlat(Long id, PlatDTO plat);
    void deletePlat(Long id);
}
