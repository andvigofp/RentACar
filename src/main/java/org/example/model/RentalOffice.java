package org.example.model;

import java.util.List;

/**
 * @Author: Andrés Fernández Pereira
 */
public class RentalOffice {
    private String address;
    private Integer feeForDelivery;
    private List<Car> cars;

    public RentalOffice(String address, Integer feeForDelivery, List<Car> cars) {
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.cars = cars;
    }

    public RentalOffice(Integer feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    public List<Car> getCars() {
        return cars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFeeForDelivery() {
        return feeForDelivery;
    }

    public void setFeeForDelivery(Integer feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RentalOffice: ");
        sb.append(" address: '").append(address).append('\'');
        sb.append(", feeForDelivery: ").append(feeForDelivery);
        return sb.toString();
    }
}

