package com.megharbaestrems.ProjetJee.dao;

import com.megharbaestrems.ProjetJee.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
