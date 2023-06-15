package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

public class AddGatoUseCase {
    private GatoRepository gatoRepository;

    public AddGatoUseCase(GatoRepository gatoRepository){
        this.gatoRepository = gatoRepository;
    }

    public void execute(Gato gato){
        gatoRepository.save(gato);
    }
}
