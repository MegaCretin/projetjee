package com.megharbaestrems.ProjetJee.service;

import com.megharbaestrems.ProjetJee.business.Reservation;
import com.megharbaestrems.ProjetJee.dto.ReservationDto;

import java.util.List;

public interface ReservationService {

    Reservation enregistrerReservation(Reservation reservation);

    Reservation enregistrerReservation(ReservationDto reservationDto);

    List<Reservation> recupererReservations();

    Reservation recupererReservation(Long id);

    boolean supprimerReservation(Long id);
}
