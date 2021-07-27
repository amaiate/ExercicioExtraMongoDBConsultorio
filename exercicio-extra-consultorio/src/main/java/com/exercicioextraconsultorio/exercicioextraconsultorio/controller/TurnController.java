package com.exercicioextraconsultorio.exercicioextraconsultorio.controller;


import com.exercicioextraconsultorio.exercicioextraconsultorio.dto.TurnDTO;
import com.exercicioextraconsultorio.exercicioextraconsultorio.form.TurnForm;
import com.exercicioextraconsultorio.exercicioextraconsultorio.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consulta")
public class TurnController {


    private TurnService turnService;


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

}
