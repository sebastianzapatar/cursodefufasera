package com.sindocker.apijava.service;

import com.sindocker.apijava.dto.HechiceroDTO;
import com.sindocker.apijava.model.Hechicero;

import java.util.List;
import java.util.Set;

public interface IHechiceroService {
    default public void saludar(){
        System.out.println("Juan Pablo si entendera?? 😶");
    }
    List<Hechicero> getHechiceros();
    Hechicero save(HechiceroDTO hechiceroDTO);
    Hechicero getHechiceroById(String id);

}
