package com.exercicioextraconsultorio.exercicioextraconsultorio.service;

import com.exercicioextraconsultorio.exercicioextraconsultorio.dto.TurnDTO;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Turn;
import com.exercicioextraconsultorio.exercicioextraconsultorio.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
