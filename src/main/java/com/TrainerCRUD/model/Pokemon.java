package com.TrainerCRUD.model;

import java.util.List;

public class Pokemon {

    private int id;
    private int number;
    private String name;

    public Pokemon() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
}