package com.gestcantine.GestCantineADA.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PlatDTO {
    private Long id;
    private String name;
    private String summary;

}
