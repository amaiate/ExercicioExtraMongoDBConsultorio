package com.exercicioextraconsultorio.exercicioextraconsultorio.controller;

import com.exercicioextraconsultorio.exercicioextraconsultorio.form.DoctorForm;
import com.exercicioextraconsultorio.exercicioextraconsultorio.form.PatientForm;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Patient;
import com.exercicioextraconsultorio.exercicioextraconsultorio.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {


    private PatientService patientService;


    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody PatientForm patientForm){
        patientService.save(PatientForm.converter(patientForm));
        return ResponseEntity.ok(patientForm);
    }

    @GetMapping
    public List<Patient> get (){
        return patientService.findAll();
    }

}
