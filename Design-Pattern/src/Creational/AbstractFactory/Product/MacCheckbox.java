package Creational.AbstractFactory.Product;

public class MacCheckbox implements Checkbox{
    @Override
    public void onCheck() {
        System.out.println("onCheck Mac Checkbox");
    }
}
