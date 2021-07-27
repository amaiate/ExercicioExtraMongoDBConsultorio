package com.exercicioextraconsultorio.exercicioextraconsultorio.dto;

import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnDTO {
    private String id;

    private PatientDTO patient;

    private DoctorDTO doctor;

    private String date;

    private Status status;

    public static TurnDTO convertEntityToDTO (Turn turn){
        return new TurnDTO(
                turn.getId(),
                PatientDTO.convertEntityToDTO(turn.getPatient()),
                DoctorDTO.convertEntityToDTO(turn.getDoctor()),
                turn.getDate(),
                turn.getStatus()
        );
    }

    public static List<TurnDTO> turnEntityToDTO(List<Turn> turns) {
        List<TurnDTO> turnDTOS = new ArrayList<>();

        for (Turn turn : turns) {
            turnDTOS.add(convertEntityToDTO(turn));
        }

        return turnDTOS;
    }

}
