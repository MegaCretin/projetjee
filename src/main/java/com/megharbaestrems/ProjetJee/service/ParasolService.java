package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Parasol;

import java.util.List;

public interface ParasolService {

    Parasol enregistrerParasol(Parasol parasol);

    List<Parasol> recupererParasols();

    Parasol recupererParasol(Long id);

    Parasol mettreAJourParasol(Parasol parasol);

    boolean supprimerParasol(Long id);
}
