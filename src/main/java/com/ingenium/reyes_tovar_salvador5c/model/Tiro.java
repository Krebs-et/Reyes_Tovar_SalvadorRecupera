package com.ingenium.reyes_tovar_salvador5c.model;

import lombok.Getter;

import java.util.Random;

@Getter
public class Tiro {
    private long id;
    private long partidaId;
    private int valorDado1, valorDado2, suma;
    boolean esGanador = false;
    boolean esPerdedor = false;


    public Tiro(long partidaId) {
        this.partidaId = partidaId;
        this.valorDado1 = new Random().nextInt(6) + 1;
        this.valorDado2 = new Random().nextInt(6) + 1;
        this.suma = valorDado1 + valorDado2;

        if ( suma == 7 || suma == 11 ) {
            this.esGanador = true;
        } else if (suma == 2 || suma == 3 || suma == 12){
            this.esPerdedor = true;
        }

    }

    public Tiro(long id, long partidaId, int valorDado1, int valorDado2, int suma) {
        this.id = id;
        this.partidaId = partidaId;
        this.valorDado1 = valorDado1;
        this.valorDado2 = valorDado2;
        this.suma = suma;
    }
}

