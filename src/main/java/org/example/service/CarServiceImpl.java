package org.example.service;

import org.example.model.Car;
import org.example.repository.CarRepository;
import org.example.repository.ClientRepository;
import org.example.repository.ICarRepository;
import org.example.repository.IClientRepository;

import java.util.ArrayList;

/**
 * @Author: Andrés Fernández Pereira
 */
public class CarServiceImpl implements ICarService {
    private ICarRepository repository;

    public CarServiceImpl () {
        repository = new CarRepository();
    }

    @Override
    public void add(Car car) {
        repository.add(car);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ArrayList findAll() {
        return repository.findAll();
    }

    @Override
    public Car findBylicensePlate(String licensePlate) {
        return repository.findBylicensePlate(licensePlate);
    }

    @Override
    public void update(Car car) {
        repository.update(car);
    }
}
