package Creational.FactoryMethod.Product;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render a button in Windows style");
    }

    @Override
    public void onClick() {
        System.out.println("Windows style button on click");
    }
    
    
}
