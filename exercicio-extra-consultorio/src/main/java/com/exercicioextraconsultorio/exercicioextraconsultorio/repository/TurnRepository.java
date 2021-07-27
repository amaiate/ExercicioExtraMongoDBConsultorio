package com.exercicioextraconsultorio.exercicioextraconsultorio.repository;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Status;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnRepository extends MongoRepository<Turn, String> {

    List<Turn> findTurnsByDoctor_LastName(String lastName);

    List<Turn> findTurnsByStatus(String status);
}
