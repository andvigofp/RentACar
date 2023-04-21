package org.example.service;

import org.example.model.Car;
import org.example.model.RentalOffice;

import java.util.ArrayList;

/**
 * @Author: Andrés Fernández Pereira
 */
public interface RentalOfficeService {
    void add(RentalOffice rentalOffice);
    void deleteById(Integer feeForDelivery);
    ArrayList findAll();
    RentalOffice findByaddress(String address);
    void update(RentalOffice rentalOffice);
}
