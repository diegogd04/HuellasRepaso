package com.dgd.huellasRepaso.presentation;

import com.dgd.huellasRepaso.data.remote.AdopcionDataRepository;
import com.dgd.huellasRepaso.data.remote.GatoDataRepository;
import com.dgd.huellasRepaso.data.remote.PersonaDataRepository;
import com.dgd.huellasRepaso.domain.models.*;
import com.dgd.huellasRepaso.domain.useCase.*;

import java.util.List;

public class TerminalView {
    public void init(){
        GatoRepository gatoRepository = new GatoDataRepository();
        AddGatoUseCase addGatoUseCase = new AddGatoUseCase(gatoRepository);
        PersonaRepository personaRepository = new PersonaDataRepository();
        AddPersonaUseCase addPersonaUseCase = new AddPersonaUseCase(personaRepository);
        AdopcionRepository adopcionRepository = new AdopcionDataRepository();
        AddAdopcionUseCase addadopcionUseCase = new AddAdopcionUseCase(adopcionRepository);
        DeleteGatoUseCase deleteGatoUseCase = new DeleteGatoUseCase(gatoRepository);
        GetGatosUseCase getGatosUseCase = new GetGatosUseCase(gatoRepository);
        GetAdopcionesUseCase getAdopcionesUseCase = new GetAdopcionesUseCase(adopcionRepository);

        Gato gato1 = new Gato();
        gato1.setId(1);
        gato1.setNombre("Niebla");
        gato1.setFechaNacimiento("12/04/2022");
        gato1.setSexo("M");
        gato1.setVirus(false);
        addGatoUseCase.execute(gato1);

        Gato gato2 = new Gato();
        gato2.setId(2);
        gato2.setNombre("Lámpara");
        gato2.setFechaNacimiento("28/03/2022");
        gato2.setSexo("Hembra");
        gato2.setVirus(true);
        addGatoUseCase.execute(gato2);

        Adoptante adoptante1 = new Adoptante();
        adoptante1.setId(1);
        adoptante1.setNombre("Alberto");
        adoptante1.setApellidos("Sáez Álvarez");
        adoptante1.setDni("56432456N");
        adoptante1.setFechaNacimiento("08/07/1999");
        adoptante1.setDireccion("Hornos Caleros Nº4 6ºB");
        addPersonaUseCase.execute(adoptante1);

        Adoptante adoptante2 = new Adoptante();
        adoptante2.setId(2);
        adoptante2.setNombre("Laura");
        adoptante2.setApellidos("García García");
        adoptante2.setDni("21581246I");
        adoptante2.setFechaNacimiento("14/02/1992");
        adoptante2.setDireccion("Plaza España Nº37 2ºC");
        addPersonaUseCase.execute(adoptante2);

        Socio socio= new Socio();
        socio.setId(1);
        socio.setNombre("Jordi");
        socio.setApellidos("Peinado Flores");
        socio.setDni("48376524H");
        socio.setCuentaBancaria("ES126483156487");

        Adopcion adopcion1 = new Adopcion();
        adopcion1.setId(1);
        adopcion1.setFechaAdopcion("21/05/2023");
        adopcion1.setAdoptante(adoptante1);
        adopcion1.setAnimal(gato1);
        addadopcionUseCase.execute(adopcion1);
        deleteGatoUseCase.execute(gato1);

        Adopcion adopcion2 = new Adopcion();
        adopcion2.setId(2);
        adopcion2.setFechaAdopcion("25/05/2023");
        adopcion2.setAdoptante(adoptante2);
        adopcion2.setAnimal(gato2);
        addadopcionUseCase.execute(adopcion2);
        deleteGatoUseCase.execute(gato2);

        System.out.println("Gatos");
        System.out.println("-----");
        List<Gato> gatos = getGatosUseCase.execute();
        System.out.println();
        System.out.println("Adopciones");
        System.out.println("----------");
        List<Adopcion> adopciones = getAdopcionesUseCase.execute();
    }
}
