package com.GestionLocationV.Glocation.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.GestionLocationV.Glocation.DTO.CarDTO;
import com.GestionLocationV.Glocation.Entity.CarEntity;

@Component

public class CarMapper  {


    public CarDTO CarToDTO(CarEntity carEntity) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(carEntity.getId());
        carDTO.setMarque(carEntity.getMarque());
        carDTO.setModel(carEntity.getModel());
        carDTO.setTarifHiver(carEntity.getTarifHiver());
        carDTO.setTarifETE(carEntity.getTarifETE());
        carDTO.setDateApplicationHiver(carEntity.getDateApplicationHiver());
        carDTO.setDateApplicationEte(carEntity.getDateApplicationEte());
        carDTO.setMatricul(carEntity.getMatricul());
        carDTO.setDateCreation(carEntity.getDateCreation());
        carDTO.setDateMaj(carEntity.getDateMaj());
        carDTO.setUserMaj(carEntity.getUserMaj());
        return carDTO;
    }

    public CarEntity carDTOToEntity(CarDTO carDTO) {
        CarEntity carEntity = new CarEntity();
        carEntity.setId(carDTO.getId());
        carEntity.setMarque(carDTO.getMarque());
        carEntity.setModel(carDTO.getModel());
        carEntity.setTarifHiver(carDTO.getTarifHiver());
        carEntity.setTarifETE(carDTO.getTarifETE());
        carEntity.setDateApplicationHiver(carDTO.getDateApplicationHiver());
        carEntity.setDateApplicationEte(carDTO.getDateApplicationEte());
        carEntity.setMatricul(carDTO.getMatricul());
        carEntity.setDateCreation(carDTO.getDateCreation());
        carEntity.setDateMaj(carDTO.getDateMaj());
        carEntity.setUserMaj(carDTO.getUserMaj());
        return carEntity;
    }

    public List<CarDTO> carListToDTO(List<CarEntity> carEntities) {
        return carEntities.stream()
                .map(this::CarToDTO)
                .collect(Collectors.toList());
    }
}
