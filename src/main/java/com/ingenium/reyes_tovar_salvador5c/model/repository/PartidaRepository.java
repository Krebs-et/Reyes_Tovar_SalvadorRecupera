package com.ingenium.reyes_tovar_salvador5c.model.repository;

import com.ingenium.reyes_tovar_salvador5c.model.Partida;



public interface PartidaRepository  {

    void iniciar(Partida partida);

    Partida buscarPartida(long l);

    void save(Partida partida);
}
