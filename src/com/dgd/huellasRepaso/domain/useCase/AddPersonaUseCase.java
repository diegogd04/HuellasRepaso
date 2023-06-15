package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Persona;

public class AddPersonaUseCase {
    private PersonaRepository personaRepository;

    public AddPersonaUseCase(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    public void execute(Persona persona){
        personaRepository.save(persona);
    }
}
