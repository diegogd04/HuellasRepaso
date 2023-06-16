package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

import java.util.List;

public class GetGatosRemoteUseCase {
    private GatoRepository gatoRepository;

    public GetGatosRemoteUseCase(GatoRepository gatoRepository){
        this.gatoRepository = gatoRepository;
    }

    public List<Gato> execute(){
        return gatoRepository.getAllWithRemote();
    }
}
