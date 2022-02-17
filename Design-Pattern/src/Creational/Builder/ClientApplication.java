package Creational.Builder;

import Creational.Builder.Builder.CarBuilder;
import Creational.Builder.Builder.CarManualBuilder;
import Creational.Builder.Product.Car;
import Creational.Builder.Product.Manual;

public class ClientApplication {
    public void makeCar() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getProduct();
        
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual manual = carManualBuilder.getManual();

        System.out.println(car.toString());
        System.out.println(manual.toString());
    }
}
