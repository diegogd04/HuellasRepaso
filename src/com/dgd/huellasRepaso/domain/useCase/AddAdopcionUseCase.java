package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Adopcion;

public class AddAdopcionUseCase {
    private AdopcionRepository adopcionRepository;

    public AddAdopcionUseCase(AdopcionRepository adopcionRepository){
        this.adopcionRepository = adopcionRepository;
    }

    public void execute(Adopcion adopcion){
        adopcionRepository.save(adopcion);
    }
}
