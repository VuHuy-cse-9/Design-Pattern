package Creational.Builder.Product;

public class Car {
    public int nseats;
    public String engine;
    public String tripComputer;
    public String GPS; 
    public String toString() {
        return "Car: nseats " + nseats + 
                " engine " + engine + 
                " TripComputer " + tripComputer + 
                " GPS" + GPS;
    }
}
