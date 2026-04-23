package com.ingenium.reyes_tovar_salvador5c.database.entity.jpa;

import com.ingenium.reyes_tovar_salvador5c.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// AQUÍ ME EQUIVOQUEÉ Y DEBÍA PONER LA ENTITY NO EL MODELO


@Repository
public interface JpaJugadorRepository extends JpaRepository<Jugador, Long> {
}
