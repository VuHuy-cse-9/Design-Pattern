package Creational.AbstractFactory.Product;

public class WinCheckbox implements Checkbox{
    @Override
    public void onCheck() {
        System.out.println("onCheck Window checkbox");
        
    }
    
}
