package com.TrainerCRUD.service;

import com.TrainerCRUD.model.Pokemon;
import com.TrainerCRUD.model.Trainer;

import java.util.List;

public class TrainerService {

    public Trainer createTrainer(String nome, Integer idade, String cidade, Pokemon pokemon) {
        Trainer trainer = new Trainer();
        trainer.setNome(nome);
        trainer.setIdade(idade);
        trainer.setCidade(cidade);
        trainer.setPokemon(pokemon);

        return trainer;
    }

    public Trainer getTrainer(Long nome) {
        return null;
    }

    public List<Trainer> getAllTrainers() {
        return List.of();
    }

    public Trainer updateTrainer(Long id) {
            return null;
        }

    public void deleteTrainer(Long id) {

    }
}
