package carFactoryExample;

import carFactoryExample.cars.*;

public class LeftSideFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case FOCUS -> {
                return new Ford("2300", "Gas", "2020", position);
            }
            case CMAX -> {
                return new Ford("2000", "Diesel", "2020", position);
            }
            default -> throw new UnsupportedOperationException("Unknown model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5 -> {
                return new BMW("3000","Gas", "2020", position);
            }
            case E90 -> {
                return new BMW("2300", "Diesel", "2020", position);
            }
            default -> throw new UnsupportedOperationException("Unknown model");
        }
    }
}
