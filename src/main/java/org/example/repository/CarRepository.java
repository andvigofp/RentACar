package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Andrés Fernández Pereira
 */
public class CarRepository implements ICarRepository {
    List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
    }


    public void add(Car car) {
        if (findByLicensePlate(car.getLicensePlaze()) == null) {
            car.setId(nextIdAvailable());
            cars.add(car);
        } else System.out.println("La matricula " + car.getLicensePlaze() + " ya está registrada");
    }

    @Override
    public void deleteById(Long id) {
        if (findById(id).getId().equals(id)) {
            cars.remove(findById(id));
        }
    }


    @Override
    public List<Car> findAll() {
        return cars;
    }


    @Override
    public Long nextIdAvailable() {
        if (!cars.isEmpty()) {
            return cars.get(cars.size() - 1).getId() + 1;
        } else return 1L;
    }

    public Car findById(Long id) {
        if (!cars.isEmpty()) {
            for (Car car : cars) {
                if (car.getId().equals(id)) {
                    return car;
                } else return null;
            }
        }
        return null;
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        if (!cars.isEmpty()) {
            for (Car car : cars) {
                if (car.getLicensePlaze().equalsIgnoreCase(licensePlate)) {
                    return car;
                } else return null;
            }
        }
        return null;
    }


    public void update(Car car) {
        if (findById(car.getId())!= null){
            findById(car.getId()).setLicensePlaze(car.getLicensePlaze());

        }
    }
}


