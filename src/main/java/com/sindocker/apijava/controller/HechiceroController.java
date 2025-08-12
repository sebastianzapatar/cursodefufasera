package com.sindocker.apijava.controller;

import com.sindocker.apijava.dto.HechiceroDTO;
import com.sindocker.apijava.model.Hechicero;
import com.sindocker.apijava.service.IHechiceroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hechiceros")
public class HechiceroController {
    @Autowired
    private IHechiceroService hechiceroService;
    @GetMapping("/")
    public List<Hechicero> getHechiceros() {
        return hechiceroService.getHechiceros();
    }
    @GetMapping("/{id}")
    public Hechicero getHechiceroById(@PathVariable("id") String id) {
        return hechiceroService.getHechiceroById(id);
    }
    @PostMapping("/")
    public Hechicero createHechicero(@RequestBody HechiceroDTO hechicero) {
        return this.hechiceroService.save(hechicero);
    }
}
