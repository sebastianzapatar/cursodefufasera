package com.sindocker.apijava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name="jp")
public class Virgenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String description;
    @Column(nullable=false)
    private Long age;
    @Column(unique = true)
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hechicero_id",nullable = true)
    private Hechicero hechicero;
}
