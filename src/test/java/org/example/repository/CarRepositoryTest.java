package org.example.repository;

import org.example.model.Car;
import org.example.model.RentalOffice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Andrés Fernández Pereira
 */
class CarRepositoryTest {
    ICarRepository carRepository;
    RentalOffice rentalOffice1 = new RentalOffice("Avenida Madrid",25);
    RentalOffice rentalOffice2 = new RentalOffice("Calle Barcelona 25",18);
    RentalOffice rentalOffice3 = new RentalOffice("Calle Urzaiz 3",18);

    @BeforeEach
    void setUp() {
        carRepository = new CarRepository();
        Car car1 = new Car("ADFG",rentalOffice1);
        Car car2 = new Car("FGHS",rentalOffice2);
        Car car3 = new Car("BCZX",rentalOffice3);
        carRepository.add(car1);
        carRepository.add(car2);
        carRepository.add(car3);
    }

    @Test
    void add() {
        RentalOffice rentalOffice4 = new RentalOffice("Avenida Madrid,5",19);
        Car car4 = new Car("ADFL",rentalOffice1);
        carRepository.add(car4);
        Assertions.assertEquals(4,carRepository.findAll().size());
        RentalOffice rentalOffice5 = new RentalOffice("Avenida Madrid,6",19);
        Car car5 = new Car("BHSC",rentalOffice5);
        carRepository.add(car5);
        Assertions.assertEquals(5,carRepository.findAll().size());

    }

    @Test
    void addCarToOffice() {
        Assertions.assertEquals(1,rentalOffice1.getCars().size());
    }

    @Test
    void deleteById() {

    }

    @Test
    void findAll() {
    }

    @Test
    void nextIdAvailable() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByLicensePlate() {
    }

    @Test
    void update() {
    }
}