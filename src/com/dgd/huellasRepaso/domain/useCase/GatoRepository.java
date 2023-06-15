package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

import java.util.List;

public interface GatoRepository {
    public void save(Gato gato);

    public List<Gato> getAll();
}
