package com.sindocker.apijava.service;

import com.sindocker.apijava.dao.IVirgenesDao;
import com.sindocker.apijava.dto.VirgenesDTO;
import com.sindocker.apijava.excepciones.UniqueException;
import com.sindocker.apijava.model.Virgenes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VirgenesService implements IVirgenesService {
    @Autowired
    private IVirgenesDao virgenesDao;

    @Override
    public List<VirgenesDTO> getVirgenes() {

        return virgenesDao.
                findAll()
                .stream()
                .map(virgen ->
                        new VirgenesDTO(
                                virgen.getName(),
                                virgen.getDescription(),
                                virgen.getAge(),
                                virgen.getEmail()

                        )).toList();
    }

    @Override
    public Virgenes getVirgenesById(Long id) {
        return this.virgenesDao.findVirgenesById(id).
                orElse(null);
    }

    @Override
    public void save(VirgenesDTO virgenes) {
        Virgenes virgenesEntity = new Virgenes();
        virgenesEntity.setAge(virgenes.edad());
        virgenesEntity.setName(virgenes.nombre());
        virgenesEntity.setDescription(virgenes.descripcion());
        virgenesEntity.setEmail(virgenes.correo());
        Virgenes existe=this.virgenesDao.
                findVirgenesByEmail(virgenes.correo()).
                orElse(null);
        if (existe != null) {
            throw new UniqueException("Dyllan ya existe " +
                    "no sea torpe");
        }
        virgenesDao.save(virgenesEntity);
        this.virgenesDao.save(virgenesEntity);
    }

    @Override
    public void delete(Long id) {
        this.virgenesDao.deleteById(id);
    }
}
