package com.megharbaestrems.ProjetJee.dto;

import lombok.Data;

@Data
public class UtilisateurDto {

    protected Long id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String motdepasse;
}
