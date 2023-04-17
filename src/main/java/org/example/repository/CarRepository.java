package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Andrés Fernández Pereira
 */
public class CarRepository implements ICarRepository{
private ArrayList<Car> cars;

public CarRepository() {
    cars = new ArrayList<>();
}

    @Override
    public void add(Car car) {
    car.setId(nextIdAvailable());
    cars.add(car);
    }

    @Override
    public void update(Car car) {
    Car carToUpdate = findById(car.getId());
    if(carToUpdate !=null) {
        carToUpdate.setId(car.getId());
        carToUpdate.setLicensePlaze(car.getLicensePlaze());
    }
    }


    @Override
    public ArrayList findAll() {
        return cars;
    }


    @Override
    public void deleteById(Long id) {
    if (!cars.isEmpty()) {
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext());
        Car car = iterator.next();
        if (car.getId()==id) {
            cars.remove(car);
        }
    }
    }



    @Override
    public Long nextIdAvailable() {
        return null;
    }

    @Override
    public Car findById(Long id) {
        return null;
    }

    @Override
    public Car findBylicensePlate(String licensePlate) {
        return null;
    }


}
