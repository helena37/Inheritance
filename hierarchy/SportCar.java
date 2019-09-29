package hierarchy;

public class SportCar extends Car {
    private static final double DEFAULT_FUEL_Consumption = 9;
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(10);
    }
}
