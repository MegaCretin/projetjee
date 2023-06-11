package com.megharbaestrems.ProjetJee.dao;

import com.megharbaestrems.ProjetJee.business.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDao extends JpaRepository<Reservation, Long> {

}
