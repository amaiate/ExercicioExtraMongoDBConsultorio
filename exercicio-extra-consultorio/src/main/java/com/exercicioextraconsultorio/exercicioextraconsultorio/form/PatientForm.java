package com.exercicioextraconsultorio.exercicioextraconsultorio.form;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientForm {


    private String firstName;

    private String lastName;

    private Integer age;

    private String gerder;

    public static Patient converter (PatientForm patientForm){
        return new Patient(patientForm.firstName, patientForm.lastName, patientForm.age, patientForm.gerder);

    }

}
