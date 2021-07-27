package com.exercicioextraconsultorio.exercicioextraconsultorio.repository;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    Optional<Doctor> findDoctorByLastName(String lastName);
}
