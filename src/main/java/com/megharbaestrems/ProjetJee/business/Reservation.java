package com.megharbaestrems.ProjetJee.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Merci de rentrer une date de début")
    private LocalDate dateDebut;

    //blablabla
    @Column(nullable = false)
    @NotBlank(message = "Merci de rentrer une date de fin")
    private LocalDate dateFin;

    @Column(nullable = false)
    @NotNull(message = "Merci de rentrer un montant à régler")
    private Double montantAReglerEnEuros;

    @JsonIgnore
    @Lob
    private String remarques;

    @Column(nullable = false)
    @NotBlank(message = "Merci de rentrer un numero carte")
    private String numeroCarte;

    @Column(nullable = false)
    @NotNull(message = "Merci de rentrer un mois d'expiration")
    private Byte moisExpiration;

    @Column(nullable = false)
    @NotNull(message = "Merci de rentrer une année d'expiration")
    private Byte anneeExpiration;

    //blablabla
    @Column(nullable = false)
    @NotBlank(message = "Merci de rentrer un cryptogramme")
    private String cryptogramme;

    @NotBlank(message = "Merci de rentrer un cryptogramme")
    @ManyToOne
    private Concessionnaire concessionnaire;

    @NotBlank(message = "Merci de rentrer un status")
    @ManyToOne
    private Statut statut;

    @NotBlank(message = "Merci de rentrer un client")
    @ManyToOne
    private Client client;

    @JsonIgnore
    @ManyToMany
    private List<Parasol> parasols;
}
