package com.TrainerCRUD.repository;

import com.TrainerCRUD.model.Trainer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TrainerRepository {

    private EntityManager entityManager;

    public TrainerRepository() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("trainers");
        entityManager = entityManagerFactory.createEntityManager();
    }

    /**
     * Verifica se um treinador existe no banco de dados.
     *
     * @param id O ID do treinador a ser verificado.
     * @return `true` se o treinador existir, `false` caso contrário.
     */
    public boolean trainerExists(Long id) {
        return entityManager.find(Trainer.class, id) != null;
    }

    /**
     * Cria um novo treinador.
     *
     * @param trainer O treinador a ser criado.
     * @return O treinador criado.
     */
    public Trainer createTrainer(Trainer trainer) {
        if (trainerExists(trainer.getId()))
        {
            return null;
        }
        entityManager.persist(trainer);
        return trainer;
    }

    /**
     * Recupera um treinador pelo seu ID.
     *
     * @param id O ID do treinador a ser recuperado.
     * @return O treinador recuperado.
     */
    public Trainer getTrainer(Long id) {
        return entityManager.find(Trainer.class, id);
    }

    /**
     * Recupera todos os treinadores.
     *
     * @return Uma lista de todos os treinadores.
     */
    public List<Trainer> getAllTrainers() {
        return entityManager.createQuery("SELECT t FROM Trainer t", Trainer.class).getResultList();
    }

    /**
     * Atualiza um treinador existente.
     *
     * @param id O ID do treinador a ser atualizado.
     * @param trainer O treinador com as alterações a serem aplicadas.
     * @return O treinador atualizado.
     */
    public Trainer updateTrainer(Long id, Trainer trainer) {
        if (!trainerExists(id))
        {
            return null;
        }

        entityManager.merge(trainer);
        return trainer;
    }

    /**
     * Exclui um treinador.
     *
     * @param id O ID do treinador a ser excluído.
     */
    public void deleteTrainer(Long id) {
        if (!trainerExists(id))
        {
            return;
        }
        entityManager.remove(getTrainer(id));
    }
}
