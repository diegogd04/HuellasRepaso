package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GatoMemLocalDataSource {
    private static GatoMemLocalDataSource instance = null;

    private Map<Integer, Gato> storage = new TreeMap<>();

    private GatoMemLocalDataSource(){

    }

    public void save(Gato gato){
        storage.put(gato.getId(), gato);
    }

    public void delete(Integer gatoId){
        storage.remove(gatoId);
    }

    public Gato findById(Integer gatoId){
        return storage.get(gatoId);
    }

    public List<Gato> findAll(){
        return new ArrayList<>(storage.values());
    }

    public static GatoMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new GatoMemLocalDataSource();
        }
        return instance;
    }
}
