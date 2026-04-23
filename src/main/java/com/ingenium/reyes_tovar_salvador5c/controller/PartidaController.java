package com.ingenium.reyes_tovar_salvador5c.controller;

import com.ingenium.reyes_tovar_salvador5c.DTO.PartidaDTO;
import com.ingenium.reyes_tovar_salvador5c.DTO.TiroDTO;
import com.ingenium.reyes_tovar_salvador5c.service.useCase.IniciarPartidaUseCase;
import com.ingenium.reyes_tovar_salvador5c.service.useCase.LanzarTiroUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/partida")
public class PartidaController {

    private final IniciarPartidaUseCase iniciarPartidaUseCase;
    private final LanzarTiroUseCase tiroUseCase;

    @PostMapping("/crear")
    public ResponseEntity<String> iniciarPartida (PartidaDTO dto) {

        iniciarPartidaUseCase.execute(dto);

        return ResponseEntity.ok("Partida Creada.");


    }

    @PostMapping("/tirar")
    public ResponseEntity<String> lanzarTiro (TiroDTO dto) {
        return ResponseEntity.ok(tiroUseCase.execute(dto));
    }

}
