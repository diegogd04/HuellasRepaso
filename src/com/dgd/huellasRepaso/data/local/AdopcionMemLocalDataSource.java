package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Adopcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AdopcionMemLocalDataSource {
    private static AdopcionMemLocalDataSource instance = null;

    private Map<Integer, Adopcion> storage = new TreeMap<>();

    private AdopcionMemLocalDataSource(){

    }

    public void save(Adopcion adopcion){
        storage.put(adopcion.getId(), adopcion);
    }

    public List<Adopcion> findAll(Integer adopcionId){
        return new ArrayList<>(storage.values());
    }
}
