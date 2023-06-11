package com.megharbaestrems.ProjetJee.business;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public abstract class Utilisateur {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable=false,updatable=true)
    @NotBlank(message="merci de préciser le nom de l'utilisateur")
    @Size(min=2, message="Le nom de l'utilisateur doit comporter au moins {min} caractères")
    protected String nom;

    @Column(nullable=false,updatable=true)
    @NotBlank(message="merci de préciser le nom de l'utilisateur")
    @Size(min=2, message="Le nom de l'utilisateur doit comporter au moins {min} caractères")
    protected String prenom;

    @Email(message="L''adresse email renseignée n'est pas valide")
    protected String email;


    @Column(nullable=false,updatable=true)
    @NotBlank(message="merci de préciser un mot de passe")
    @Size(min=7, message="le mot de passe doit comporter au moins {min} caractères")
    protected String motdepasse;
}
