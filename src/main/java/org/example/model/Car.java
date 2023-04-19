package org.example.model;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Car {
    private Long id;
    private String licensePlaze;



    public Car(Long id, String licensePlaze) {
        this.id = id;
        this.licensePlaze = licensePlaze;
    }

    public Car(String licensePlaze) {
        this.licensePlaze = licensePlaze;
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
        sb.append(" id: ").append(id);
        sb.append(", licensePlaze: '").append(licensePlaze).append('\'');
        return sb.toString();
    }
}
