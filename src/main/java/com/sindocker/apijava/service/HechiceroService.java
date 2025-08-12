package com.sindocker.apijava.service;

import com.sindocker.apijava.dao.IHechiceroDAO;
import com.sindocker.apijava.dto.HechiceroDTO;
import com.sindocker.apijava.model.Hechicero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HechiceroService implements IHechiceroService {
    @Autowired
    private IHechiceroDAO hechiceroDAO;
    @Override
    public List<Hechicero> getHechiceros() {
        return this.hechiceroDAO.findAll();
    }

    @Override
    public Hechicero save(HechiceroDTO hechiceroDTO) {
        Hechicero h = new Hechicero();
        h.setNombre(hechiceroDTO.nombre());
        h.setElemento(hechiceroDTO.elemento());
        this.hechiceroDAO.save(h);
        return  this.hechiceroDAO.save(h);
    }

    @Override
    public Hechicero getHechiceroById(String id) {
        return this.hechiceroDAO.findById(id).
                orElse(null);
    }
}
