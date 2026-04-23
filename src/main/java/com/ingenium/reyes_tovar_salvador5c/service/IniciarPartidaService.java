package com.ingenium.reyes_tovar_salvador5c.service;

import com.ingenium.reyes_tovar_salvador5c.DTO.PartidaDTO;
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
    public void execute(PartidaDTO dto) {

        Jugador jugador = jugadorRepository.findById(dto.jugadorId()).orElseThrow(() -> new IllegalArgumentException("El jugador no existe."));

        if (jugador.getSaldo() < dto.apuesta()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        jugador.apostar(dto.apuesta());

        jugadorRepository.guardar(jugador);

        Partida nuevaPartida = new Partida(
                dto.jugadorId(),
                dto.apuesta()
        );


        partidaRepository.iniciar(nuevaPartida);
    }
}
