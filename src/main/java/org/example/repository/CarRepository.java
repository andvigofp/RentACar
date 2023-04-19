package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;

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


    public void add(Car car) {
    car.setId(nextIdAvailable());
    cars.add(car);
    }


    public void update(Car car) {
        Car carToUpdate = findById(car.getId());
        if(carToUpdate != null){
            carToUpdate.setLicensePlaze(car.getLicensePlaze());

        }
    }



    public ArrayList findAll() {
        return cars;
    }


    @Override
    public void deleteById(Long id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                cars.remove(car);
                break;
            }
        }
    }


    @Override
    public Long nextIdAvailable() {
        if(!cars.isEmpty()){
            return cars.get(cars.size()-1).getId() + 1;
        }
        else{
            return (long)1;
        }
    }

    public Car findById(Long id) {
        for (Car car : cars) {
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }

    public Car findBylicensePlate(String licensePlate) {
        for (Car car : cars) {
            if(car.getLicensePlaze().equals(licensePlate)){
                return car;
            }
        }
        return null;
    }

}
