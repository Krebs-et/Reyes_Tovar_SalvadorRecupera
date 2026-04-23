package com.ingenium.reyes_tovar_salvador5c.service.useCase;

import com.ingenium.reyes_tovar_salvador5c.DTO.PartidaDTO;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;


public interface IniciarPartidaUseCase {

    Partida execute(PartidaDTO partida);


}
