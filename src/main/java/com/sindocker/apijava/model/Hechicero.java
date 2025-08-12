package com.sindocker.apijava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name="hechiceros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hechicero {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(unique=true, nullable=false)
    private String nombre;
    private String elemento;
    @OneToMany(mappedBy = "hechicero",
            cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Virgenes> virgenes;

}
