package org.example.model;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Car {
    private Long idCar;
    private String licensePlaze;


    public Car(Long idCar) {
        this.idCar = idCar;
    }

    public Car(String licensePlaze) {
        this.licensePlaze = licensePlaze;
    }

    public Car(Long idCar, String licensePlaze) {
        this.idCar = idCar;
        this.licensePlaze = licensePlaze;
    }



    public Long getIdCar() {
        return idCar;
    }

    public void setId(Long idCar) {
        this.idCar = idCar;
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
        sb.append(" id: ").append(idCar);
        sb.append(", licensePlaze: '").append(licensePlaze).append('\'');
        return sb.toString();
    }
}
