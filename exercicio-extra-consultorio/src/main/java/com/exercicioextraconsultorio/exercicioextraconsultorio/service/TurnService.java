package com.exercicioextraconsultorio.exercicioextraconsultorio.service;

import com.exercicioextraconsultorio.exercicioextraconsultorio.dto.TurnDTO;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Status;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import com.exercicioextraconsultorio.exercicioextraconsultorio.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnService {

    @Autowired
    private TurnRepository turnRepository;

    public TurnDTO findById (String id){
        return TurnDTO.convertEntityToDTO(turnRepository.findById(id).get());
    }

    public Turn save(Turn turn){
        return turnRepository.save(turn);
    }

    public List<Turn> findAll (){
        return turnRepository.findAll();
    }

    public List<Turn> findByDoctorLastName(String doctorLastName) {
        return this.turnRepository.findTurnsByDoctor_LastName(doctorLastName);
    }

    public List<Turn> findByStatus(String status) {
        return this.turnRepository.findTurnsByStatus(status);
    }

}
