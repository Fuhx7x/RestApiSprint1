package com.GestionLocationV.Glocation.Service;

import com.GestionLocationV.Glocation.DTO.CarDTO;
import com.GestionLocationV.Glocation.Entity.CarEntity;
import com.GestionLocationV.Glocation.Mapper.CarMapper;
import com.GestionLocationV.Glocation.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarService  {
	
	
	
	   private final CarMapper carMapper;

	    @Autowired
	    public CarService(CarMapper carMapper) {
	        this.carMapper = carMapper;
	    }
	
	

    @Autowired
    private CarRepository carRepository;




    public List<CarDTO> getCars() {
        List<CarEntity> carEntities = carRepository.findAll();
        return carMapper.carListToDTO(carEntities);
    }

    public CarDTO getCarById(Integer id) {
        Optional<CarEntity> optionalCarEntity = carRepository.findById(id);
        if (optionalCarEntity.isPresent()) {
            CarEntity carEntity = optionalCarEntity.get();
            return carMapper.CarToDTO(carEntity);
        } else {
            throw new NoSuchElementException("ID not found");
        }
    }

    public CarEntity saveCar(CarDTO carDTO) {
        CarEntity carEntity = carMapper.carDTOToEntity(carDTO);
        carRepository.save(carEntity);
        return carEntity;
    }


}
