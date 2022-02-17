package Creational.Builder.Builder;

import Creational.Builder.Product.Car;

public class CarBuilder implements Builder{
    private Car car;
    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        //The reset method clears the object being built
        this.car = new Car();
    }
    //All production steps work with the same product instance
    @Override
    public void setSeats(int num) {
        //Set the number of seats in the car
        this.car.nseats = num;
    }

    @Override
    public void setEngine(String type) {
        //Set the Engine in the car
        this.car.engine = type;
    }

    @Override
    public void setTripComputer(String type) {
        //Set the trip computer
        this.car.tripComputer = type;
    }

    @Override
    public void setGPS(String type) {
        //Set the GPS of the car
        this.car.GPS = type; 
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
