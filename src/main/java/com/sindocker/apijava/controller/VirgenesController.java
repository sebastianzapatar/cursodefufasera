package com.sindocker.apijava.controller;

import com.sindocker.apijava.dto.VirgenesDTO;
import com.sindocker.apijava.model.Virgenes;
import com.sindocker.apijava.service.IVirgenesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/virgenes")
public class VirgenesController {

    @Autowired
    private IVirgenesService virgenesService;
    @GetMapping("/")
    public List<VirgenesDTO> getVirgenes(){
        return this.virgenesService.getVirgenes();
    }
    @GetMapping("/{id}")
    public Virgenes getVirgenesById(@PathVariable("id") Long id){
        return this.virgenesService.getVirgenesById(id);
    }
    @PostMapping("/")
    public void addVirgene(@RequestBody @Valid
                               VirgenesDTO virgenes){

        this.virgenesService.save(virgenes);
    }
    @DeleteMapping("/{id}")
    public void deleteVirgene(@PathVariable Long id){
        this.virgenesService.delete(id);
    }
}
