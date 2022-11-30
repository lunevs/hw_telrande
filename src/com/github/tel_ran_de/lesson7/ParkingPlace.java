package com.github.tel_ran_de.lesson7;

public class ParkingPlace {
    public String parkingCode;
    public String carNumber;
    public Boolean isEmpty;
    static int parkingNum = 0;
    static int parkingSq = 5;

    ParkingPlace(String code) {
        this.parkingCode = code;
        this.isEmpty = true;
        parkingNum += 1;
    }

    public void bookPlace(String carNumber) {
        this.carNumber = carNumber;
        isEmpty = false;
    }

    public static double getReagentNeed() {
        return 0.1 * parkingNum * parkingSq;
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "parkingCode='" + parkingCode + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", parkingNum='" + parkingNum + '\'' +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
