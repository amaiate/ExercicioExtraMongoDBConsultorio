package com.exercicioextraconsultorio.exercicioextraconsultorio.service;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import com.exercicioextraconsultorio.exercicioextraconsultorio.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> findAll (){
        return doctorRepository.findAll();
    }

    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }
}
