package com.ingenium.reyes_tovar_salvador5c.database.entity.adapter;

import com.ingenium.reyes_tovar_salvador5c.database.entity.jpa.JpaJugadorRepository;
import com.ingenium.reyes_tovar_salvador5c.model.Jugador;
import com.ingenium.reyes_tovar_salvador5c.model.repository.JugadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JugadorRepositoryAdapter implements JugadorRepository {

    private final JpaJugadorRepository jpaJugadorRepository;

    @Override
    public void guardar(Jugador jugador) {
        jpaJugadorRepository.save(jugador);
    }

    @Override
    public Optional<Jugador> findById(Long id) {
        return jpaJugadorRepository.findById(id);
    }
}
