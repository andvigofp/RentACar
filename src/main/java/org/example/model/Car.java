package org.example.model;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Car {
    private Long id;
    private String licensePlaze;
    private RentalOffice rentalOffice;

    public Car(Long id, String licensePlaze) {
        this.id = id;
        this.licensePlaze = licensePlaze;
    }

    public Car(String licensePlaze) {
        this.licensePlaze = licensePlaze;
    }

    public Car(Long id) {
        this.id = id;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idCar) {
        this.id = id;
    }

    public String getLicensePlaze() {
        return licensePlaze;
    }

    public void setLicensePlaze(String licensePlaze) {
        this.licensePlaze = licensePlaze;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car: ");
        sb.append(" ID Car: ").append(id);
        sb.append(", License Plate: '").append(licensePlaze).append('\'');
        return sb.toString();
    }
}
