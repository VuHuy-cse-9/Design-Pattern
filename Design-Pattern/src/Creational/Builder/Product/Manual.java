package Creational.Builder.Product;

public class Manual {
    public int nseats;
    public String engine;
    public String tripComputer;
    public String GPS; 
    public String toString() {
        return "Manual: nseats " + nseats + 
                " engine " + engine + 
                " TripComputer " + tripComputer + 
                " GPS" + GPS;
    }
}
