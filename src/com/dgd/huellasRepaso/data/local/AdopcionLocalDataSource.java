package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Adopcion;

import java.util.List;

public interface AdopcionLocalDataSource {
    public void save(Adopcion adopcion);

    public List<Adopcion> getAll();
}
