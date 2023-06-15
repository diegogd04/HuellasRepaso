package com.dgd.huellasRepaso.data.remote;

import com.dgd.huellasRepaso.data.local.AdopcionFileLocalDataSource;
import com.dgd.huellasRepaso.domain.models.Adopcion;
import com.dgd.huellasRepaso.domain.useCase.AdopcionRepository;

import java.util.List;

public class AdopcionDataRepository implements AdopcionRepository {
    public AdopcionFileLocalDataSource localDataSource = AdopcionFileLocalDataSource.getInstance();

    @Override
    public void save(Adopcion adopcion) {

    }

    @Override
    public List<Adopcion> getAll() {
        return null;
    }
}
