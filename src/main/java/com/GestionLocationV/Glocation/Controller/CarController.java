package com.GestionLocationV.Glocation.Controller;

import com.GestionLocationV.Glocation.DTO.CarDTO;
import com.GestionLocationV.Glocation.Entity.CarEntity;
import com.GestionLocationV.Glocation.Mapper.CarMapper;
import com.GestionLocationV.Glocation.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cars")
public class CarController {

    private final CarService carService;
    @Autowired
    private CarMapper carMapper;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/ListCars")
    public List<CarDTO> getAllCar() {
        return carService.getCars();
    }

    @GetMapping("/ListCars/{id}")
    public CarDTO getCarEntity(@PathVariable Integer id) {
        return carService.getCarById(id);
    }

    @PostMapping("/createCar")
    public ResponseEntity<CarEntity> createCar(@RequestBody CarDTO carDTO) {
        CarEntity carEntity = carService.saveCar(carDTO);
        return ResponseEntity.status(HttpStatus.OK).body(carEntity);
    }



}
