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
    IRentalOfficeRepository rentalReposiory;
    RentalOffice rentalOffice1 = new RentalOffice("Avenida Madrid",25);
    RentalOffice rentalOffice2 = new RentalOffice("Calle Barcelona 25",18);
    RentalOffice rentalOffice3 = new RentalOffice("Calle Bilbao 1",30);



    @BeforeEach
    void setUp() {
        carRepository = new CarRepository();
        rentalReposiory = new RentalOfficeRepository();
        rentalReposiory.add(rentalOffice1);
        rentalReposiory.add(rentalOffice2);

    }

    @Test
    void add() {
       Car car1 = Car.newCar("GHAS",rentalOffice1);

       carRepository.add(car1);
       carRepository.add(car1);
       carRepository.add(car1);

       for (Car car: carRepository.findAll()) {
           System.out.println(car);
       }
       Assertions.assertEquals(1,carRepository.findAll().size());
       Assertions.assertEquals(1,car1.getRentalOffice().getCars().size());

    }

    @Test
    void deleteById() {
        Car car2 = Car.newCar("FDSX",rentalOffice1);
        Car car3 = Car.newCar("XCSF",rentalOffice1);

        carRepository.add(car2);
        carRepository.add(car3);
        carRepository.deleteById(1L);
        Assertions.assertEquals(1,carRepository.findAll().size());
        Assertions.assertEquals(1,car2.getRentalOffice().getCars().size());


    }

    @Test
    void findAll() {
    }

    @Test
    void addCarToOffice() {
        Assertions.assertEquals(1,rentalOffice1.getCars().size());
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