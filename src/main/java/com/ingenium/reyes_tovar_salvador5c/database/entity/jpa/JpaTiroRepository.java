package com.ingenium.reyes_tovar_salvador5c.database.entity.jpa;

import com.ingenium.reyes_tovar_salvador5c.model.Tiro;
import org.springframework.data.jpa.repository.JpaRepository;


// AQUÍ ME EQUIVOQUEÉ Y DEBÍA PONER LA ENTITY NO EL MODELO

public interface JpaTiroRepository extends JpaRepository<Tiro, Long> {
}
