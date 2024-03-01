package com.example.carrentalapp.repository;

import com.example.carrentalapp.model.Car;

import java.util.List;
import java.util.Optional;

public class CarRepository {

    List<Car> cars;
    public List<Car> findByAvailableTrue() {

        return cars;
    }

    public void save(Car car) {


    }

    public Optional<Car> findById(Object carId) {

        return Optional.of((Car)carId);
    }
}
