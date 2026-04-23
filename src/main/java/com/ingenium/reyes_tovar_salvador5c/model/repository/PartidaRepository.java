package com.ingenium.reyes_tovar_salvador5c.model.repository;

import com.ingenium.reyes_tovar_salvador5c.database.entity.PartidaEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PartidaRepository extends JpaRepository<PartidaEntity, Long> {

    PartidaEntity iniciar(Partida partida);


}
