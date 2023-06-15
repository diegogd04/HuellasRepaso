package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Gato;
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

public class GatoFileLocalDataSource {

    private static GatoFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeContactoList = new TypeToken<ArrayList<Gato>>() {
    }.getType();

    private GatoFileLocalDataSource() {
    }

    public void save(Gato gato) {
        List<Gato> gatos = findAll();
        gatos.add(gato);
        saveToFile(gatos);
    }

    private void saveToFile(List<Gato> gatos) {
        try {
            FileWriter myWriter = new FileWriter("gatos.txt");
            myWriter.write(gson.toJson(gatos));
            myWriter.close();
            System.out.println("Gato guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Gato findById(Integer gatoId) {
        List<Gato> gatos = findAll();
        for (Gato gato : gatos) {
            if (Objects.equals(gato.getId(), gatoId)) {
                return gato;
            }
        }
        return null;
    }

    public List<Gato> findAll() {
        try {
            File myObj = new File("gatos.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeContactoList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Gato>();
    }

    public static GatoFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new GatoFileLocalDataSource();
        }
        return instance;
    }
}
