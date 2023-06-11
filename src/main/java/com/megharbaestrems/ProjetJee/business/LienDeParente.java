package com.megharbaestrems.ProjetJee.business;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class LienDeParente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Merci de rentrer un nom de parenté")
    private String nom;

    @Column(nullable = false)
    @NotNull(message = "Merci de rentrer un coefficient")
    private Double coefficient;

    public LienDeParente(String nom, Double coefficient) {
        this.nom = nom;
        this.coefficient = coefficient;
    }
}
