package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Persona;

public interface PersonaRepository {
    public void save(Persona persona);

    public Persona getById(Integer personaId);
}
