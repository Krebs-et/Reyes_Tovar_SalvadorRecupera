package com.ingenium.reyes_tovar_salvador5c.model;

import lombok.Getter;

@Getter
public class Jugador {
    Long id;
    String nombre;
    double saldo;
    boolean activo;


    public Jugador (
            String nombre
    ){
        this.nombre = nombre;
        this.saldo = 100;
        this.activo = true;
    }

    public Jugador(Long id, String nombre, double saldo, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.activo = activo;
    }


    public void apostar(double apuesta){
        this.saldo -= apuesta;
    }
}
