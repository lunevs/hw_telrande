public class Car {
    private String regNumber;
    String model;
    boolean isRented;

    public Car(String registrationNumber) {
        regNumber = registrationNumber;
    }

    public Car(String regNumber, String model) {
        this.regNumber = regNumber;
        this.model = model;
    }

    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}