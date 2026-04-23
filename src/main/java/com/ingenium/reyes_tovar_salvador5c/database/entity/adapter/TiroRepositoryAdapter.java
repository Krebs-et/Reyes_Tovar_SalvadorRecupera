package com.ingenium.reyes_tovar_salvador5c.database.entity.adapter;

import com.ingenium.reyes_tovar_salvador5c.database.entity.TiroEntity;
import com.ingenium.reyes_tovar_salvador5c.database.entity.jpa.JpaTiroRepository;
import com.ingenium.reyes_tovar_salvador5c.model.Tiro;
import com.ingenium.reyes_tovar_salvador5c.model.repository.TiroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TiroRepositoryAdapter implements TiroRepository {

    private final JpaTiroRepository jpaTiroRepository;

    @Override
    public Tiro tirar(Tiro tiro) {
        return jpaTiroRepository.save(tiro);
    }
}
