package com.exercicioextraconsultorio.exercicioextraconsultorio.dto;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Doctor;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Patient;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnDTO {

    private Patient patient;

    private Doctor doctor;

    private String date;

    private Status status;

    public static TurnDTO convertEntityToDTO (Turn turn){
        return new TurnDTO(
                turn.getPatient(),
                turn.getDoctor(),
                turn.getDate(),
                turn.getStatus()
        );
    }

}
