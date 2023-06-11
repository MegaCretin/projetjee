package com.megharbaestrems.ProjetJee.business;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class File{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotNull(message="Merci de préciser un numéro")
    private Byte numero;

    @Column(nullable = false)
    @NotNull(message="Merci de préciser un prix")
    private Double prixJournalier;

    @JsonIgnore
    @OneToMany(mappedBy="file", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Parasol> parasols;

    public File(byte numero, double prixJournalier) {
        this.numero = numero;
        this.prixJournalier = prixJournalier;
    }
}
