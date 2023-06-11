package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.LienDeParente;

import java.util.List;

public interface LienDeParenteService {

    LienDeParente enregistrerLienDeParente(LienDeParente lienDeParente);

    List<LienDeParente> recupererLiensDeParentes();

    LienDeParente recupererLienDeParente(Long id);

    LienDeParente mettreAJourLienDeParente(LienDeParente lienDeParente);

    boolean supprimerClient(Long id);
}
