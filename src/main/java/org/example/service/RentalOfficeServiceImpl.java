package org.example.service;

import org.example.model.Car;
import org.example.model.RentalOffice;
import org.example.repository.CarRepository;
import org.example.repository.ICarRepository;
import org.example.repository.IRentalOfficeRepository;
import org.example.repository.RentalOfficeRepository;

import java.util.ArrayList;

/**
 * @Author: Andrés Fernández Pereira
 */
public class RentalOfficeServiceImpl implements RentalOfficeService{

    private IRentalOfficeRepository repository;

    public RentalOfficeServiceImpl() {
        repository = new RentalOfficeRepository();
    }


    @Override
    public void add(RentalOffice rentalOffice) {
        repository.add(rentalOffice);
    }

    @Override
    public void deleteById(Integer feeForDelivery) {

    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public RentalOffice findByaddress(String address) {
        return null;
    }

    @Override
    public void update(RentalOffice rentalOffice) {

    }
}
