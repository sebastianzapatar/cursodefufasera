package com.sindocker.apijava.dao;

import com.sindocker.apijava.model.Hechicero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHechiceroDAO
        extends JpaRepository<Hechicero, String> {
}
