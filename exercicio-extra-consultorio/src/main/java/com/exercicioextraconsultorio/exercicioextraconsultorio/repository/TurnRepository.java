package com.exercicioextraconsultorio.exercicioextraconsultorio.repository;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends MongoRepository<Turn, String> {
}
