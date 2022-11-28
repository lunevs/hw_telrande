package com.github.tel_ran_de.lesson6;

public class ParkingPlace {
    private String parkingCode;
    private String carNumber;
    private Boolean isEmpty;

    ParkingPlace(String code) {
        this.parkingCode = code;
    }

    public void bookPlace(String carNumber) {
        this.carNumber = carNumber;
        isEmpty = false;
    }

    public void freePlace() {
        isEmpty = true;
    }

    public boolean getStatus() {
        return isEmpty;
    }

    public String getCode() {
        return parkingCode;
    }
}
