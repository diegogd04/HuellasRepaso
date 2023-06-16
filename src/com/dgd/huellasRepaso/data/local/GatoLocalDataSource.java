package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Gato;

import java.util.List;

public interface GatoLocalDataSource {
    public void save(Gato gato);

    public void delete(Gato gato);

    public Gato getById(Integer gatoId);

    public List<Gato> getAll();

    List<Gato> getAllWithRemote();
}
