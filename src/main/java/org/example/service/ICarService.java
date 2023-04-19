package org.example.service;

import org.example.model.Car;
import org.example.model.Client;

import java.util.ArrayList;

/**
 * @Author: Andrés Fernández Pereira
 */
public interface ICarService {
    void add(Car car);
    void deleteById(Long id);
    ArrayList findAll();
    Car findBylicensePlate(String licensePlate);
    void update(Car car);

}
