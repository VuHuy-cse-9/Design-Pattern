package Creational.AbstractFactory.Creator;

import Creational.AbstractFactory.Product.Button;
import Creational.AbstractFactory.Product.Checkbox;
import Creational.AbstractFactory.Product.WinButton;
import Creational.AbstractFactory.Product.WinCheckbox;

public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
    
}
