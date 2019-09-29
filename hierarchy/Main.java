package hierarchy;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(25, 23);
        car.drive(9);
        System.out.println(car.getFuel());
    }
}
