package com.megharbaestrems.ProjetJee.dao;

import com.megharbaestrems.ProjetJee.business.Concessionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcessionnaireDao extends JpaRepository<Concessionnaire, Long> {

}
