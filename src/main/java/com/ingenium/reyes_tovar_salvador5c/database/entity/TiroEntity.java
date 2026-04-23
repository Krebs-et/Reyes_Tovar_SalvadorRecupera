package com.ingenium.reyes_tovar_salvador5c.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tiros")
public class TiroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;



}
