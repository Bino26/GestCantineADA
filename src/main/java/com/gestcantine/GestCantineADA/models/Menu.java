package com.gestcantine.GestCantineADA.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plat_id", referencedColumnName = "id")
    private Plat plat;


}
