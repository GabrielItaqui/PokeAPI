package com.TrainerCRUD;

import com.TrainerCRUD.model.Pokemon;
import com.TrainerCRUD.model.Trainer;
import com.TrainerCRUD.service.TrainerService;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        pokemon.setId(1);
        pokemon.setName("pikachu");
        pokemon.setNumber(24);

        Trainer trainer = new TrainerService().createTrainer("Ash", 13, "Pallet", pokemon);
        System.out.println(trainer);
    }
}


//todo
//criar uma requisição http na pokeapi