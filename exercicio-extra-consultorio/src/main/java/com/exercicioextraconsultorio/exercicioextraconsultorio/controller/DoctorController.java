package com.exercicioextraconsultorio.exercicioextraconsultorio.controller;

import com.exercicioextraconsultorio.exercicioextraconsultorio.dto.TurnDTO;
import com.exercicioextraconsultorio.exercicioextraconsultorio.form.DoctorForm;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import com.exercicioextraconsultorio.exercicioextraconsultorio.service.DoctorService;
import com.exercicioextraconsultorio.exercicioextraconsultorio.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private DoctorService doctorService;


    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody DoctorForm doctorForm){
        doctorService.save(DoctorForm.converter(doctorForm));
        return ResponseEntity.ok(doctorForm);
    }

    @GetMapping
    public List<Doctor> get (){
        return doctorService.findAll();
    }


}
