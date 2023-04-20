package org.example.controller;

import org.example.model.Car;
import org.example.model.Client;
import org.example.service.CarServiceImpl;
import org.example.service.ICarService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Andrés Fernández Pereira
 */
public class CarController {
    private ICarService service;
    public CarController() {
        service = new CarServiceImpl();
    }

    public void add(String licensePlate){
        Car car = new Car(licensePlate);
        service.add(car);
    }

    public void deleteById(Long id){
        service.deleteById(id);
    }

    public List<Car> findAll(){
        return service.findAll();
    }

    public Car findByLicensePlate(String licensePlate){
        return service.findByLicensePlate(licensePlate);
    }

    public void update(Long id, String licensePlate){
        Car car = new Car(id, licensePlate);
        service.update(car);
    }

}
