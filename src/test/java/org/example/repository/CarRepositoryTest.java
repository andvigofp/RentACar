package org.example.repository;

import org.example.model.Car;
import org.example.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Andrés Fernández Pereira
 */
class CarRepositoryTest {

    CarRepository repository;

    @BeforeEach
    void setUp() {
    repository = new CarRepository();
        Car car1 = new Car("ADFG");
        Car car2 = new Car("FGH");
        Car car3 = new Car("HCW");
        repository.add(car1);
        repository.add(car2);
        repository.add(car3);
    }

    @Test
    void add() {
        Car car4 = new Car("ASL");
        repository.add(car4);
        Assertions.assertEquals(car4,repository.findById(4L));
        Car car5 = new Car("VCS");
        repository.add(car5);
        Assertions.assertEquals(car5.getId(),repository.findById(5L).getId());


    }

    @Test
    void findAll() {
        Assertions.assertEquals(2,repository.findAll().size());
        Car car = new Car("LNU");
        repository.add(car);
        Assertions.assertEquals(3,repository.findAll().size());
    }

    @Test
    void deleteById() {
        Assertions.assertEquals(2,repository.findAll().size());
        repository.deleteById(4L);
        Assertions.assertEquals(2,repository.findAll().size());
        repository.deleteById(3L);
        Assertions.assertEquals(1,repository.findAll().size());
        repository.deleteById(2L);
        Assertions.assertEquals(1,repository.findAll().size());
        repository.deleteById(1L);
        Assertions.assertEquals(0,repository.findAll().size());
    }



    @Test
    void nextIdAvailable() {
        Assertions.assertEquals(3,repository.nextIdAvailable());
        Car car = new Car("LNU");
        repository.add(car);
        Assertions.assertEquals(4,repository.nextIdAvailable());
        repository.deleteById(1L);
        Assertions.assertEquals(4,repository.nextIdAvailable());

    }

    @Test
    void findById() {
        Assertions.assertEquals("HUZ",repository.findById(1L).getId());
    }

    @Test
    void findBylicensePlate() {
    }

    @Test
    void update() {
    }
}