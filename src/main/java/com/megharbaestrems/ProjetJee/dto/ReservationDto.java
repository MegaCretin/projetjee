package com.megharbaestrems.ProjetJee.dto;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Concessionnaire;
import com.megharbaestrems.ProjetJee.business.Statut;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationDto {

    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montantAReglerEnEuros;
    private String numeroCarte;
    private byte moisExpiration;
    private byte anneeExpiration;
    private String cryptogramme;
    private Concessionnaire concessionnaire;
    private Statut statut;
    private Client client;
}
