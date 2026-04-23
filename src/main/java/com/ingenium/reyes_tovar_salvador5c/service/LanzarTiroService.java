package com.ingenium.reyes_tovar_salvador5c.service;

import com.ingenium.reyes_tovar_salvador5c.DTO.TiroDTO;
import com.ingenium.reyes_tovar_salvador5c.database.entity.TiroEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;
import com.ingenium.reyes_tovar_salvador5c.model.Tiro;
import com.ingenium.reyes_tovar_salvador5c.model.repository.PartidaRepository;
import com.ingenium.reyes_tovar_salvador5c.model.repository.TiroRepository;
import com.ingenium.reyes_tovar_salvador5c.service.useCase.LanzarTiroUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LanzarTiroService implements LanzarTiroUseCase {

    private final PartidaRepository partidaRepository;
    private final TiroRepository tiroRepository;

    @Override
    public String execute(TiroDTO dto) {

        String mensaje = "La partida sigue en juego";

        Partida partida = partidaRepository.buscarPartida(dto.partidaId());

        Tiro tiro = new Tiro(dto.partidaId());

        if (tiro.isEsGanador()) {
            partida.finalizar();
            mensaje = "Has ganado";
        } else if (tiro.isEsPerdedor()) {
            partida.finalizar();
            mensaje = "Has perdido";
        }

        tiroRepository.tirar(tiro);

        partidaRepository.save(partida);



        return mensaje;

    }
}
