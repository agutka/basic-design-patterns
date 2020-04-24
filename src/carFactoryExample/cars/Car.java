package carFactoryExample.cars;

abstract public class Car {

    private String engineCapacity;
    private String fuelType;
    private String productionYear;
    private SteeringWheelPosition position;

    protected Car(String engineCapacity, String fuelType, String productionYear, SteeringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.position = position;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
