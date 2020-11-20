package com.agencianacional.notas.controller;

import com.agencianacional.notas.model.dto.NotaDTO;
import com.agencianacional.notas.service.NotaServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController

public class NotaController {
 

    @Autowired
    private NotaServiceImpl notaService;

    
   
   
    @PostMapping("/notes")
    public ResponseEntity<?> Post(@Valid @RequestBody NotaDTO notaDto) {
        return ResponseEntity.ok(notaService.save(notaDto));
    }

    @GetMapping("/notes")
    public ResponseEntity<?> Get() {
        return ResponseEntity.ok(notaService.getAll());
    }

    @PutMapping("/notes/{id}")
    public ResponseEntity<?> Get(@Valid @RequestBody NotaDTO notaDto, @PathVariable("id") long id) {
        return ResponseEntity.ok(notaService.update(notaDto, id));
    }
}
