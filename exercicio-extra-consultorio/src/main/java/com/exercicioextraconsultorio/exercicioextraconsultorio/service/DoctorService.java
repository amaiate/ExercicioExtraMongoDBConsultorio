package com.exercicioextraconsultorio.exercicioextraconsultorio.service;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import com.exercicioextraconsultorio.exercicioextraconsultorio.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

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

    public Doctor findByLastName(String lastName) {
        Optional<Doctor> doctor = this.doctorRepository.findDoctorByLastName(lastName);

        if(doctor.isPresent()) {
            return doctor.get();
        }

        return null;
    }
}
