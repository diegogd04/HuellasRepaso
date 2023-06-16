package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Persona;

public class GetPersonaUseCase {
    private PersonaRepository personaRepository;

    public GetPersonaUseCase(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    public Persona execute(Integer personaId){
        return personaRepository.getById(personaId);
    }
}
