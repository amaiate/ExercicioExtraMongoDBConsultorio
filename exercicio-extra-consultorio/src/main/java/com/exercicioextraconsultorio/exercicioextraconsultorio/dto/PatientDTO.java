package com.exercicioextraconsultorio.exercicioextraconsultorio.dto;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {

    private String firstName;

    private String lastName;

    private Integer age;

    private String gerder;

    public static PatientDTO convertEntityToDTO (Patient patient){
        return new PatientDTO(
                patient.getFirstName(),
                patient.getLastName(),
                patient.getAge(),
                patient.getGerder()
        );
    }
}
