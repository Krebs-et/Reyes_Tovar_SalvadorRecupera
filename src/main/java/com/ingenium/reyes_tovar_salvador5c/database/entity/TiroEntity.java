package com.ingenium.reyes_tovar_salvador5c.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tiros")
public class TiroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "tiros_partida")
    PartidaEntity partida;

    int valorDado1;

    int valorDado2;

    int suma;

    boolean esGanador;



}
