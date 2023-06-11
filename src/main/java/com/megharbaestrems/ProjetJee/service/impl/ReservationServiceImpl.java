package com.megharbaestrems.ProjetJee.service.impl;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Reservation;
import com.megharbaestrems.ProjetJee.dao.ReservationDao;
import com.megharbaestrems.ProjetJee.dto.ReservationDto;
import com.megharbaestrems.ProjetJee.mapper.ReservationMapper;
import com.megharbaestrems.ProjetJee.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private ReservationDao reservationDao;

    @Override
    public Reservation enregistrerReservation(Reservation reservation) {
        return reservationDao.save(reservation);
    }

    @Override
    public Reservation enregistrerReservation(ReservationDto reservationDto) {
        return reservationDao.save(ReservationMapper.INSTANCE.toEntity(reservationDto));
    }

    @Override
    public List<Reservation> recupererReservations() {
        return reservationDao.findAll();
    }

    @Override
    public Reservation recupererReservation(Long id) {
        return reservationDao.findById(id).orElse(null);
    }
        @Override
    public boolean supprimerReservation(Long id) {
        Reservation reservation = recupererReservation(id);
        if (reservation != null){
            reservationDao.delete(reservation);
            return true;
        }
        return false;
    }
}
