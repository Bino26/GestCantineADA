package com.gestcantine.GestCantineADA.mapping;

public interface EntityManager<D,E> {

    D toDto(E entity);
    E toEntity(D dto);
}
