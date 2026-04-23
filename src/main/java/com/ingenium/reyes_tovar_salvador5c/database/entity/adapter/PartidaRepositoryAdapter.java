package com.ingenium.reyes_tovar_salvador5c.database.entity.adapter;

import com.ingenium.reyes_tovar_salvador5c.database.entity.JugadorEntity;
import com.ingenium.reyes_tovar_salvador5c.database.entity.PartidaEntity;
import com.ingenium.reyes_tovar_salvador5c.database.entity.jpa.JpaJugadorRepository;
import com.ingenium.reyes_tovar_salvador5c.database.entity.jpa.JpaPartidaRepository;
import com.ingenium.reyes_tovar_salvador5c.model.Jugador;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;
import com.ingenium.reyes_tovar_salvador5c.model.repository.PartidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PartidaRepositoryAdapter implements PartidaRepository {

    private final JpaJugadorRepository jugadorRepository;
    private final JpaPartidaRepository partidaRepository;

    @Override
    public void iniciar(Partida partida) {

        Jugador j = jugadorRepository.findById(partida.getJugador()).orElseThrow();

        JugadorEntity jE = new JugadorEntity(
                j.getId(),
                j.getNombre(),
                j.getSaldo(),
                j.isActivo()
        );


        PartidaEntity pE = new PartidaEntity(
                partida.getId(),
                partida.getFecha(),
                partida.getEstado(),
                jE
        );

        partidaRepository.save(pE);
    }

    @Override
    public Partida buscarPartida(long l) {
        PartidaEntity pE = partidaRepository.findById(l).orElseThrow( () -> new IllegalArgumentException( "Partida no encontrada"));
        return new Partida(
                pE.getId(),
                pE.getFecha(),
                pE.getEstado(),
                pE.getJugadorId().getId()
        );
    }

    @Override
    public void save(Partida partida) {

    }


}
