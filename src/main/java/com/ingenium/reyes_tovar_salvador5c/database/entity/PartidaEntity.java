package com.ingenium.reyes_tovar_salvador5c.database.entity;

import com.ingenium.reyes_tovar_salvador5c.model.Estados;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "partidas")
public class PartidaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate fecha;

    @Enumerated(EnumType.ORDINAL)
    Estados estado;

    @ManyToOne()
    @JoinColumn(name = "partida_jugador" )
    JugadorEntity jugadorId;

}
