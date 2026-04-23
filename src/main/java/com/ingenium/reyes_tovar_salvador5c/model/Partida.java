package com.ingenium.reyes_tovar_salvador5c.model;

import com.ingenium.reyes_tovar_salvador5c.database.entity.JugadorEntity;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Partida {

    private long id;
    private LocalDate fecha;
    private Estados estado;
    private long jugador;


    public Partida(Long jugadorId, double apuesta) {
        this.jugador = jugadorId;
        this.fecha = LocalDate.now();
        this.estado = Estados.EN_JUEGO;
    }

    public Partida(long id, LocalDate fecha, Estados estado, long jugador) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.jugador = jugador;
    }


}
