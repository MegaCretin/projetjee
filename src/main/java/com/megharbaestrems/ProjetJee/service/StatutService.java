package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Statut;

import java.util.List;

public interface StatutService {

    Statut enregistrerStatut(Statut statut);

    List<Statut> recupererStatuts();

    Statut recupererStatut(Long id);

    Statut mettreAJourStatut(Statut statut);

    boolean supprimerStatut(Long id);
}
