package com.exercicioextraconsultorio.exercicioextraconsultorio.form;


import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorForm {

    private String firstName;

    private String lastName;

    private String specialty;

    public static Doctor converter (DoctorForm doctorForm){
        return new Doctor(doctorForm.firstName, doctorForm.lastName, doctorForm.specialty);

    }


}
