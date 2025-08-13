package com.sindocker.apijava.service;

import com.sindocker.apijava.dto.VirgenesDTO;
import com.sindocker.apijava.model.Virgenes;

import java.util.List;

public interface IVirgenesService {
    public List<VirgenesDTO> getVirgenes();
    public Virgenes getVirgenesById(Long id);
    public void save(VirgenesDTO virgenes);
    public void delete(Long id);
    default String saludar(){
        return "Jara el virgen";
    }
    List<Virgenes> listarPorHechicero(String hechiceroId);

}
