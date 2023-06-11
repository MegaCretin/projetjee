package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur enregistrerUtilisateur(Utilisateur utilisateur);

    List<Utilisateur> recupererUtilisateurs();

    Utilisateur recupererUtilisateur(Long id);

    Utilisateur mettreAJourUtilisateur(Utilisateur utilisateur);

    boolean supprimerUtilisateur(Long id);
}
