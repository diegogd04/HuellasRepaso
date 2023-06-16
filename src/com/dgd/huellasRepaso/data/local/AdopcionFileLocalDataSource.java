package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Adopcion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AdopcionFileLocalDataSource {

    private static AdopcionFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeAdopcionList = new TypeToken<ArrayList<Adopcion>>() {
    }.getType();

    private AdopcionFileLocalDataSource() {
    }

    public void save(Adopcion adopcion) {
        List<Adopcion> adopciones = findAll();
        adopciones.add(adopcion);
        saveToFile(adopciones);
    }

    private void saveToFile(List<Adopcion> adopciones) {
        try {
            FileWriter myWriter = new FileWriter("adopciones.txt");
            myWriter.write(gson.toJson(adopciones));
            myWriter.close();
            System.out.println("Adopción guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Adopcion findById(Integer adopcionId) {
        List<Adopcion> adopciones = findAll();
        for (Adopcion adopcion : adopciones) {
            if (Objects.equals(adopcion.getId(), adopcionId)) {
                return adopcion;
            }
        }
        return null;
    }

    public List<Adopcion> findAll() {
        try {
            File myObj = new File("adopciones.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAdopcionList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Adopcion>();
    }

    public static AdopcionFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AdopcionFileLocalDataSource();
        }
        return instance;
    }
}
