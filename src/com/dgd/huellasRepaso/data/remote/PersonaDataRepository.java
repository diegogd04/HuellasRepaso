package com.dgd.huellasRepaso.data.remote;

import com.dgd.huellasRepaso.data.local.PersonaFileLocalDataSource;
import com.dgd.huellasRepaso.domain.models.Persona;
import com.dgd.huellasRepaso.domain.useCase.PersonaRepository;

public class PersonaDataRepository implements PersonaRepository {
    public PersonaFileLocalDataSource localDataSource = PersonaFileLocalDataSource.getInstance();

    @Override
    public void save(Persona persona) {

    }

    @Override
    public Persona getById(Integer personaId) {
        return null;
    }
}
