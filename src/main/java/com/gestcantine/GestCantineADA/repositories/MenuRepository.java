package com.gestcantine.GestCantineADA.repositories;

import com.gestcantine.GestCantineADA.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {
}
