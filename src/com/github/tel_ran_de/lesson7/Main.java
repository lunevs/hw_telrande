public class Main {
    public static void main(String[] args) {

        Car volvo = new Car("BD 534", "Volvo XC60");
        Car vw = new Car("PG 253", "VW Golf");
        Car mazda = new Car("NK 645", "Mazda 3");

        System.out.println(volvo);
        System.out.println(vw);
        System.out.println(mazda);
        System.out.println("-----------------------");

        mazda.isRented = true;

        mazda = new Car("BD 123");
        mazda.model = "Mazda 3";
        mazda.isRented = true;

        System.out.println(volvo);
        System.out.println(vw);
        System.out.println(mazda);
    }
}