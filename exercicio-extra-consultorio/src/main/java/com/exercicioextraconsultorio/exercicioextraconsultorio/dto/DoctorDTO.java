package com.exercicioextraconsultorio.exercicioextraconsultorio.dto;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {

    private String firstName;

    private String lastName;

    private String specialty;

    public static DoctorDTO convertEntityToDTO (Doctor doctor){
        return new DoctorDTO(
                doctor.getFirstName(),
                doctor.getLastName(),
                doctor.getSpecialty()
        );
    }

}
