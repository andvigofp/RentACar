package org.example.repository;

import org.example.model.Car;
import org.example.model.RentalOffice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Andrés Fernández Pereira
 */
public class RentalOfficeRepository implements IRentalOfficeRepository {
    List<RentalOffice> rentalOffices;

    public RentalOfficeRepository() {
        rentalOffices = new ArrayList<>();
    }

    @Override
    public void add(RentalOffice rentalOffice) {
        if (!rentalOffices.isEmpty()) {
            if (findById(rentalOffice.getId()) !=null) {
                rentalOffices.add(rentalOffice);
            }
        }
      }

      public RentalOffice findById(Long id) {
          //Comprobamos si el array de la RentalOffice no esta vacio
        for (RentalOffice rentalOffice: rentalOffices) {
           //Comprobamos si existe la ID en RentalOffice
            if (rentalOffice.getId().equals(id)) {
                //Establece ID para RentalOffice y agregarlo a la Array
                //rentalOffice.setId(nextIdAvailable());
                return  rentalOffice;
            }else return null;
        }
        return null;
      }


    @Override
    public void deleteById(Long id) {
        if (!rentalOffices.isEmpty()) {
            if (findById(id) !=null) {
                rentalOffices.remove(findById(id));
            }
        }else System.out.println("El id " + id + " no a sido asignado a RentalOffice ");
    }

    @Override
    public List<RentalOffice> findAll() {
        return rentalOffices;
    }

    @Override
    public Long nextIdAvailable() {
        if (!rentalOffices.isEmpty()) {
            return rentalOffices.get(rentalOffices.size()-1).getId()+1;
        }else return 1L;
    }
}
