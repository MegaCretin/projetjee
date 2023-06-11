package com.megharbaestrems.ProjetJee.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Parasol {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser un numéro emplacement")
    private String numEmplacement;

    @ManyToOne
    private File file;

    @JsonIgnore
    @ManyToMany(mappedBy="parasols", cascade=CascadeType.REMOVE)
    private List<Reservation> reservations;

    public Parasol(String numEmplacement, File file) {
        this.numEmplacement = numEmplacement;
        this.file = file;
    }
}
