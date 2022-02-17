package Creational.Builder.Builder;

import Creational.Builder.Product.Manual;

public class CarManualBuilder implements Builder{
    private Manual manual;
    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
       //The reset method clears the object being built
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int num) {
        //Write number of seats into manual
        this.manual.nseats = num;
    }

    @Override
    public void setEngine(String type) {
        //Write type of Engine into manual
        this.manual.engine = type;
    }

    @Override
    public void setTripComputer(String type) {
        //Write type of Trip computer into Manual
        this.manual.tripComputer = type;
    }

    @Override
    public void setGPS(String type) {
        //Write type of GPS into Manual
        this.manual.GPS = type;
    }   

    public Manual getManual() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
