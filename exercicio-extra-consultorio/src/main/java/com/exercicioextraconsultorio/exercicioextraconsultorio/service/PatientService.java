package com.exercicioextraconsultorio.exercicioextraconsultorio.service;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Patient;
import com.exercicioextraconsultorio.exercicioextraconsultorio.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> findAll (){
        return patientRepository.findAll();
    }

    public Patient save(Patient patient){
        return patientRepository.save(patient);
    }
}
