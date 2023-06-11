package com.megharbaestrems.ProjetJee.mapper;

import com.megharbaestrems.ProjetJee.business.Client;
import com.megharbaestrems.ProjetJee.business.Reservation;
import com.megharbaestrems.ProjetJee.dto.ClientDto;
import com.megharbaestrems.ProjetJee.dto.ReservationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDto toDto(Client client);

    Client toEntity(ClientDto clientDto);
}
