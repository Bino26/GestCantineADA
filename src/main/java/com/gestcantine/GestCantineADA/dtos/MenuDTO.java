package com.gestcantine.GestCantineADA.dtos;

import com.gestcantine.GestCantineADA.models.Plat;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MenuDTO {

    private Long id;
    private Date creationDate;
    private Plat plat ;
}
