package org.example.model;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Car {
    private Long id;
    private String licensePlaze;
    private RentalOffice  rentalOfficeAssigned;

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
        return rentalOfficeAssigned;
    }

    public void setRentalOffice(RentalOffice rentalOfficeAssigned) {
        this.rentalOfficeAssigned = rentalOfficeAssigned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
