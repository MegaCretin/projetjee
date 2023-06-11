package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Concessionnaire;

import java.util.List;

public interface ConcessionnaireService {

    Concessionnaire enregistrerConcessionnaire(Concessionnaire concessionnaire);

    List<Concessionnaire> recupererConcessionnaires();

    Concessionnaire recupererConcessionnaire(Long id);

    Concessionnaire mettreAJourConcessionnaire(Concessionnaire concessionnaire);

    boolean supprimerConcessionnaire(Long id);
}
