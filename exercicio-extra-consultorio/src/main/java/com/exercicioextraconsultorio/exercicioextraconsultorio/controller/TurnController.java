package com.exercicioextraconsultorio.exercicioextraconsultorio.controller;


import com.exercicioextraconsultorio.exercicioextraconsultorio.dto.TurnDTO;
import com.exercicioextraconsultorio.exercicioextraconsultorio.form.TurnForm;
import com.exercicioextraconsultorio.exercicioextraconsultorio.model.Status;
import com.exercicioextraconsultorio.exercicioextraconsultorio.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class TurnController {


    private final TurnService turnService;


    @Autowired
    public TurnController(TurnService turnService) {
        this.turnService = turnService;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody TurnForm turnForm){
        turnService.save(TurnForm.converter(turnForm));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public TurnDTO get (@PathVariable String id){
        return turnService.findById(id);
    }

    @GetMapping
    public List<TurnDTO> getAll (){
        return TurnDTO.turnEntityToDTO(turnService.findAll());
    }


    @GetMapping("doctor/{doctorLastName}")
    public ResponseEntity<List<TurnDTO>> getByDoctor(@PathVariable String doctorLastName) {
        List<TurnDTO> turnDTOS = TurnDTO.turnEntityToDTO(this.turnService.findByDoctorLastName(doctorLastName));

        return ResponseEntity.ok(turnDTOS);
    }

    @GetMapping("status/{status}")
    public ResponseEntity<List<TurnDTO>> getByStatus(@PathVariable String status) {
        List<TurnDTO> turnDTOS = TurnDTO.turnEntityToDTO(this.turnService.findByStatus(status));

        return ResponseEntity.ok(turnDTOS);
    }

}
