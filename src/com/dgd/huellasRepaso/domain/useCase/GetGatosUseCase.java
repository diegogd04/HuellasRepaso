package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

import java.util.List;

public class GetGatosUseCase {
    private GatoRepository gatoRepository;

    public GetGatosUseCase(GatoRepository gatoRepository){
        this.gatoRepository = gatoRepository;
    }

    public List<Gato> execute(){
        return gatoRepository.getAll();
    }
}
