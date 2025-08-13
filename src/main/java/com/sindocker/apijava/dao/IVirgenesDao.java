package com.sindocker.apijava.dao;

import com.sindocker.apijava.model.Hechicero;
import com.sindocker.apijava.model.Virgenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IVirgenesDao
        extends JpaRepository<Virgenes,Long> {
    public List<Virgenes> findVirgenesByName(String name);
    public Optional<Virgenes> findVirgenesById(Long id);
    public Optional<Virgenes> findVirgenesByEmail(String email);

    // Método derivado correcto por propiedad anidada
    List<Virgenes> findByHechicero_Id(String hechiceroId);
    // Si quieres evitar Lazy y traer el hechicero ya cargado:
    @Query("""
       select v
       from Virgenes v
       join fetch v.hechicero h
       where h.id = :hechiceroId
    """)
    List<Virgenes> findAllByHechiceroIdFetch(String hechiceroId);
}
