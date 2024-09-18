package com.gestcantine.GestCantineADA.repositories;

import com.gestcantine.GestCantineADA.models.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatRepository extends JpaRepository<Plat,Long> {
    List<Plat> findByNameContainingIgnoreCase(String name);
}
