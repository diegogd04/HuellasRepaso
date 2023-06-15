package com.dgd.huellasRepaso.data.local;

import com.dgd.huellasRepaso.domain.models.Persona;
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

public class PersonaFileLocalDataSource {

    private static PersonaFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typePersonaList = new TypeToken<ArrayList<Persona>>() {
    }.getType();

    private PersonaFileLocalDataSource() {
    }

    public void save(Persona persona) {
        List<Persona> personas = findAll();
        personas.add(persona);
        saveToFile(personas);
    }

    private void saveToFile(List<Persona> gatos) {
        try {
            FileWriter myWriter = new FileWriter("personas.txt");
            myWriter.write(gson.toJson(gatos));
            myWriter.close();
            System.out.println("Persona guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Persona findById(Integer personaId) {
        List<Persona> personas = findAll();
        for (Persona persona : personas) {
            if (Objects.equals(persona.getId(), personaId)) {
                return persona;
            }
        }
        return null;
    }

    public List<Persona> findAll() {
        try {
            File myObj = new File("personas.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typePersonaList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Persona>();
    }

    public static PersonaFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PersonaFileLocalDataSource();
        }
        return instance;
    }
}
