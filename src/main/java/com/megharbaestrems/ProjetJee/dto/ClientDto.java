package com.megharbaestrems.ProjetJee.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.megharbaestrems.ProjetJee.business.LienDeParente;
import com.megharbaestrems.ProjetJee.business.Pays;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClientDto extends UtilisateurDto {

    //blablabla
    private LocalDateTime dateHeureInscription;
    private LienDeParente lienDeParente;
    private Pays pays;
}
