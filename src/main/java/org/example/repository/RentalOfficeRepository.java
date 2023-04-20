package org.example.repository;

import org.example.model.Car;
import org.example.model.RentalOffice;

import java.util.List;

/**
 * @Author: Andrés Fernández Pereira
 */
public class RentalOfficeRepository implements IRentalOfficeRepository{
    List<RentalOffice> rentalOffices;

    @Override
    public void add(RentalOffice rentalOffice) {
        rentalOffices.add(rentalOffice);
    }

    @Override
    public void deleteByAddress(String address) {
        if (!rentalOffices.isEmpty()){
            for (RentalOffice rentalOffice:rentalOffices) {
                System.out.println(rentalOffice);
                if (rentalOffice.getAddress().equalsIgnoreCase(address)){
                    rentalOffices.remove(rentalOffice);
                }else System.out.println("Office doesn´t exist");
            }
        }else System.out.println("There are not offices registered");

    }

    @Override
    public List<RentalOffice> findAll() {
        return rentalOffices;
    }

    @Override
    public void add(Car car, RentalOffice rentalOffice) {

    }

    @Override
    public void delete(Car car, RentalOffice rentalOffice) {

    }

    @Override
    public List<Car> findAllCars(RentalOffice rentalOffice) {
        for (Car carElement : rentalOffice.getCars()) {
            System.out.println(carElement);
        }
        return rentalOffice.getCars();
    }
}
