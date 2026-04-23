package com.ingenium.reyes_tovar_salvador5c.model.repository;

import com.ingenium.reyes_tovar_salvador5c.database.entity.JugadorEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JugadorRepository extends JpaRepository<JugadorEntity, Long> {

    JugadorEntity guardar(Jugador jugador);

    Optional<JugadorEntity> findById(Long id);

}
