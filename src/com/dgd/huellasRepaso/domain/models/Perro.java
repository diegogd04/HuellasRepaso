package com.dgd.huellasRepaso.domain.models;

public class Perro extends Animal{
    private Integer raza;
    private Boolean amigable;

    public Integer getRaza() {
        return raza;
    }

    public void setRaza(Integer raza) {
        this.raza = raza;
    }

    public Boolean getAmigable() {
        return amigable;
    }

    public void setAmigable(Boolean amigable) {
        this.amigable = amigable;
    }
}
