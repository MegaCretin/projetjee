package com.megharbaestrems.ProjetJee.mapper;

import com.megharbaestrems.ProjetJee.business.Reservation;
import com.megharbaestrems.ProjetJee.dto.ReservationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    ReservationDto toDto(Reservation reservation);

    Reservation toEntity(ReservationDto reservationDto);
}
