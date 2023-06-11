package com.megharbaestrems.ProjetJee.controller;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Reservation;
import com.megharbaestrems.ProjetJee.dto.ClientDto;
import com.megharbaestrems.ProjetJee.dto.ReservationDto;
import com.megharbaestrems.ProjetJee.service.ReservationService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
@Validated
public class ReservationRestController {

    private ReservationService reservationService;

    @GetMapping("reservations")
    public List<Reservation> getReservations() {
        return reservationService.recupererReservations();
    }

    @GetMapping("reservations/{id}")
    public Reservation getReservation(Long id) {
        return reservationService.recupererReservation(id);
    }

    @PostMapping("reservations")
    @ResponseStatus(code= HttpStatus.CREATED)
    public Reservation postReservation(@RequestBody Reservation reservation) {
        return reservationService.enregistrerReservation(reservation);
    }

    @Operation(description = "Met à jour complètement la Reservation")
    @PutMapping("reservations")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<Reservation> putReservation(@Valid @RequestBody ReservationDto reservationDto, BindingResult result) {
        if (reservationDto.getId() != null) {
            if (reservationService.recupererReservation(reservationDto.getId()) != null) {
                Reservation reservation = reservationService.enregistrerReservation(reservationDto);
                return ResponseEntity.status(200).body(reservation);
            } else {
                return ResponseEntity.status(404).body(null);
            }
        } else {
            return ResponseEntity.status(400).body(null);
        }
    }

    @DeleteMapping("reservations/{id}")
    public boolean deleteReservation(Long id) {
        return reservationService.supprimerReservation(id);
    }
}
