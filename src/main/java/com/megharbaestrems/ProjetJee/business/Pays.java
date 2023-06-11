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
public class Pays {

    @Id
    @Column(nullable = false)
    @NotBlank(message="Merci de préciser un code pays")
    private String code;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser un nom pays")
    private String nom;

    @JsonIgnore
    @OneToMany(mappedBy = "pays")
    private List<Client> clients;

    public Pays(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }
}
