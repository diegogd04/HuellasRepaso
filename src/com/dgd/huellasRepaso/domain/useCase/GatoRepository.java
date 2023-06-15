package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

import java.util.List;

public interface GatoRepository {
    public void save(Gato gato);

    public void delete(Gato gato);

    public Gato getById(Integer gatoId);

    public List<Gato> getAll();
}
