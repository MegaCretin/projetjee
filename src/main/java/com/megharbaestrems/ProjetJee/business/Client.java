package com.megharbaestrems.ProjetJee.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Client extends Utilisateur {

    private LocalDateTime dateHeureInscription;

    @ManyToOne
    private LienDeParente lienDeParente;

    @ManyToOne
    private Pays pays;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
}
