package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.File;

import java.util.List;

public interface FileService {

    File enregistrerFile(File file);

    List<File> recupererFiles();

    File recupererFile(Long id);

    File mettreAJourFile(File file);

    boolean supprimerFile(Long id);
}
