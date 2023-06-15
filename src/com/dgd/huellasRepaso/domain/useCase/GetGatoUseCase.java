package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

public class GetGatoUseCase {
    private GatoRepository gatoRepository;

    public GetGatoUseCase(GatoRepository gatoRepository){
        this.gatoRepository = gatoRepository;
    }

    public Gato execute(Integer gatoId){
        return gatoRepository.getById(gatoId);
    }
}
