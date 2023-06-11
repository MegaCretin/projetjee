package com.megharbaestrems.ProjetJee.business;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Statut {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser un nom statut")
    private String nom;

    public Statut(String nom) {
        this.nom = nom;
    }
}
