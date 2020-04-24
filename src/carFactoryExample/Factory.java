package carFactoryExample;

import carFactoryExample.cars.BMWModel;
import carFactoryExample.cars.Car;
import carFactoryExample.cars.FordModel;

public interface Factory {

    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);
}
