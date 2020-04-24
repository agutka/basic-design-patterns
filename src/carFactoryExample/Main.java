package carFactoryExample;

import carFactoryExample.cars.BMWModel;
import carFactoryExample.cars.Car;
import carFactoryExample.cars.FordModel;

public class Main {

    public static void main(String[] args) {

        Factory leftSideFactory = new LeftSideFactory();
        Factory rightSideFactory = new RightSideFactory();

        Car bmw = leftSideFactory.buildBMW(BMWModel.X5);
        Car ford = rightSideFactory.buildFord(FordModel.FOCUS);

        System.out.println(bmw.getPosition());
        System.out.println(ford.getPosition());
    }
}
