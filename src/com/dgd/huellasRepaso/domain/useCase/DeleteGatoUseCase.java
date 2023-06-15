package com.dgd.huellasRepaso.domain.useCase;

import com.dgd.huellasRepaso.domain.models.Gato;

public class DeleteGatoUseCase {
    private GatoRepository gatoRepository;

    public DeleteGatoUseCase(GatoRepository gatoRepository){
        this.gatoRepository = gatoRepository;
    }

    public void execute(Gato gato){
        gatoRepository.delete(gato);
    }
}
