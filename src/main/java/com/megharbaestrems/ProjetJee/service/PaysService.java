package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Pays;

import java.util.List;

public interface PaysService {
    Pays enregistrerPays(Pays pays);

    List<Pays> recupererPays();

    Pays recupererPays(Long id);

    Pays mettreAJourPays(Pays pays);

    boolean supprimerPays(Long id);
}
