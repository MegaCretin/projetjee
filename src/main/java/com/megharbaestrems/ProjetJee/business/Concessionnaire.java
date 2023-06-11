package com.megharbaestrems.ProjetJee.business;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Concessionnaire extends Utilisateur {

    private String numeroDeTelephone;

}