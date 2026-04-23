package com.ingenium.reyes_tovar_salvador5c.database.entity.jpa;

import com.ingenium.reyes_tovar_salvador5c.database.entity.PartidaEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPartidaRepository  extends JpaRepository<PartidaEntity, Long> {

}
