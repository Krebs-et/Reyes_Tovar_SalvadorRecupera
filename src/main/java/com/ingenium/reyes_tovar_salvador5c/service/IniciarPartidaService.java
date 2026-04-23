package com.ingenium.reyes_tovar_salvador5c.service;

import com.ingenium.reyes_tovar_salvador5c.DTO.PartidaDTO;
import com.ingenium.reyes_tovar_salvador5c.database.entity.JugadorEntity;
import com.ingenium.reyes_tovar_salvador5c.database.entity.PartidaEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Jugador;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;
import com.ingenium.reyes_tovar_salvador5c.model.repository.JugadorRepository;
import com.ingenium.reyes_tovar_salvador5c.model.repository.PartidaRepository;
import com.ingenium.reyes_tovar_salvador5c.service.useCase.IniciarPartidaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IniciarPartidaService implements IniciarPartidaUseCase {

    private final PartidaRepository partidaRepository;
    private final JugadorRepository jugadorRepository;

    @Override
    public Partida execute(PartidaDTO dto) {

        JugadorEntity jugadorEntity = jugadorRepository.findById(dto.jugadorId()).orElseThrow(() -> new IllegalArgumentException("El jugador no existe."));

        Jugador jugador = new Jugador(
                jugadorEntity.getId(),
                jugadorEntity.getNombre(),
                jugadorEntity.getSaldo(),
                jugadorEntity.isActivo()
        );

        if (jugador.getSaldo() < dto.apuesta()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        jugador.apostar(dto.apuesta());

        Partida nuevaPartida = new Partida(
                dto.jugadorId(),
                dto.apuesta()
        );

        PartidaEntity pE = partidaRepository.iniciar(nuevaPartida);

        return new Partida(
                pE.getId(),
                pE.getFecha(),
                pE.getEstado(),
                pE.getJugadorId().getId()
        );
    }
}
