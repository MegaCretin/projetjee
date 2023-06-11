package com.megharbaestrems.ProjetJee.dao;

import com.megharbaestrems.ProjetJee.business.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDao extends JpaRepository<File, Long> {

}
