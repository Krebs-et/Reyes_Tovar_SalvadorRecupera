package com.ingenium.reyes_tovar_salvador5c.model.repository;

import com.ingenium.reyes_tovar_salvador5c.database.entity.TiroEntity;
import com.ingenium.reyes_tovar_salvador5c.model.Tiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiroRepository extends JpaRepository<TiroEntity, Long> {

    TiroEntity tirar(Tiro tiro);

}
