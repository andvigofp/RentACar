package org.example.repository;

import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Andrés Fernández Pereira
 */
public interface ICarRepository {
    void add(Car car);
    void deleteById(Long id);
    List<Car> findAll();
    Long nextIdAvailable();
    Car findById(Long id);
    Car findByLicensePlate(String licensePlate);
    void update(Car car);
}
