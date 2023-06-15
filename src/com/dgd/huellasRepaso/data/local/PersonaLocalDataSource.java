package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Persona;

import java.util.List;

public interface PersonaLocalDataSource {
    public void save(Persona persona);

    public Persona getById(Integer personaId);
}
