package com.gestcantine.GestCantineADA.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class MenuDTO {

    private Long id;
    private Date creationDate;
}
