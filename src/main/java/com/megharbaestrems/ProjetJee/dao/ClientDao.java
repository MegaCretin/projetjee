package com.megharbaestrems.ProjetJee.dao;

import com.megharbaestrems.ProjetJee.business.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientDao extends JpaRepository<Client, Long> {

    Optional<Client> findById(Long id);
}
