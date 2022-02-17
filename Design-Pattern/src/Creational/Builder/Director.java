package Creational.Builder;

import Creational.Builder.Builder.Builder;

public class Director {
    void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setEngine("Nito3541");
        builder.setSeats(4);
        builder.setGPS("EFF7569");
        builder.setTripComputer("MacMi341");
    }   

    void constructSUV(Builder builder) {
        builder.reset();
        builder.setEngine("Nito7898");
        builder.setGPS("EFF7569");
        builder.setSeats(6);
        builder.setTripComputer("MacPro3456");
    }
}
