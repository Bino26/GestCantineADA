package com.gestcantine.GestCantineADA.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
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
