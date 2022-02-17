package Creational.FactoryMethod.Product;

public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("Render a button in HTML style");
    }

    @Override
    public void onClick() {
        System.out.println("Web style HTML on click");
    }
    
}
