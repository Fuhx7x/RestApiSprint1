package com.GestionLocationV.Glocation.Repository;

import com.GestionLocationV.Glocation.Entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <CarEntity, Integer> {



}
