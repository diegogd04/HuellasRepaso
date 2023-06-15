package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Persona;

import java.util.Map;
import java.util.TreeMap;

public class PersonaMemLocalDataSource {
    private static PersonaMemLocalDataSource instance = null;

    private Map<Integer, Persona> storage = new TreeMap<>();

    private PersonaMemLocalDataSource(){

    }

    public void save(Persona persona){
        storage.put(persona.getId(), persona);
    }

    public Persona getById(Integer personaId){
        return storage.get(personaId);
    }
}
