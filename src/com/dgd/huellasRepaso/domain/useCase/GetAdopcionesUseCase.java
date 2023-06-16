package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Adopcion;

import java.util.List;

public class GetAdopcionesUseCase {
    private AdopcionRepository adopcionRepository;

    public GetAdopcionesUseCase(AdopcionRepository adopcionRepository){
        this.adopcionRepository = adopcionRepository;
    }

    public List<Adopcion> execute(){
        return adopcionRepository.getAll();
    }
}
