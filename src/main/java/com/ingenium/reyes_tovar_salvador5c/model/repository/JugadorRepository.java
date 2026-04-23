package com.ingenium.reyes_tovar_salvador5c.model.repository;

import com.ingenium.reyes_tovar_salvador5c.model.Jugador;

import java.util.Optional;

public interface JugadorRepository {

    void guardar(Jugador jugador);

    Optional<Jugador> findById(Long id);

}
