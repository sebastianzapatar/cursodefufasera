package com.sindocker.apijava.dao;

import com.sindocker.apijava.model.Hechicero;
import com.sindocker.apijava.model.Virgenes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHechiceroDAO
        extends JpaRepository<Hechicero, String> {
      List<Virgenes> findVirgenenesById(String id);
   }
