package com.ingenium.reyes_tovar_salvador5c.service;

import com.ingenium.reyes_tovar_salvador5c.DTO.TiroDTO;
import com.ingenium.reyes_tovar_salvador5c.database.entity.PartidaEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;
import com.ingenium.reyes_tovar_salvador5c.model.Tiro;
import com.ingenium.reyes_tovar_salvador5c.model.repository.PartidaRepository;
import com.ingenium.reyes_tovar_salvador5c.service.useCase.LanzarTiroUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LanzarTiroService implements LanzarTiroUseCase {

    private final PartidaRepository partidaRepository;

    @Override
    public Tiro execute(TiroDTO dto) {

        PartidaEntity partidaEntity = partidaRepository.findById(dto.partidaId()).orElseThrow(() -> new IllegalArgumentException("Partida no encontrada."));




        return null;
    }
}
