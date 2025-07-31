package com.sindocker.apijava.dao;

import com.sindocker.apijava.model.Virgenes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IVirgenesDao
        extends JpaRepository<Virgenes,Long> {
    public List<Virgenes> findVirgenesByName(String name);
    public Optional<Virgenes> findVirgenesById(Long id);
    public Optional<Virgenes> findVirgenesByEmail(String email);
}
