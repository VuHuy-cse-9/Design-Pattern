package Creational.Builder.Builder;

public interface Builder {
    public void reset();
    public void setSeats(int num);
    public void setEngine(String type);
    public void setTripComputer(String type);
    public void setGPS(String type);
}
