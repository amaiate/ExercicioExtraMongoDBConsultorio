package com.exercicioextraconsultorio.exercicioextraconsultorio.form;

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
public class TurnForm {

    private Patient patient;

    private Doctor doctor;

    private String date;

    private Status status;

    public static Turn converter (TurnForm turnForm){
        return new Turn(
                turnForm.patient,
                turnForm.doctor,
                turnForm.date,
                turnForm.status
        );
    }
}
