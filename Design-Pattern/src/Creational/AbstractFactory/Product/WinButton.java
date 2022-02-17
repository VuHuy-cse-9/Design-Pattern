package Creational.AbstractFactory.Product;

public class WinButton implements Button{
    @Override
    public void onClick() {
        System.out.println("onClick Window button!");
    }
}
