package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Adopcion;

import java.util.List;

public interface AdopcionRepository {
    public void save(Adopcion adopcion);

    public List<Adopcion> getAll();
}
