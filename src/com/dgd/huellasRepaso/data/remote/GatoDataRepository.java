package com.dgd.huellasRepaso.data.remote;

import com.dgd.huellasRepaso.data.local.GatoFileLocalDataSource;
import com.dgd.huellasRepaso.domain.models.Gato;
import com.dgd.huellasRepaso.domain.useCase.GatoRepository;

import java.util.List;

public class GatoDataRepository implements GatoRepository {
    public GatoFileLocalDataSource localDataSource = GatoFileLocalDataSource.getInstance();

    @Override
    public void save(Gato gato) {

    }

    @Override
    public void delete(Gato gato) {

    }

    @Override
    public Gato getById(Integer gatoId) {
        return null;
    }

    @Override
    public List<Gato> getAll() {
        return null;
    }

    @Override
    public List<Gato> getAllWithRemote() {
        return null;
    }
}
