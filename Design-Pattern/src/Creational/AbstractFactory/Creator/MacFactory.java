package Creational.AbstractFactory.Creator;

import Creational.AbstractFactory.Product.Button;
import Creational.AbstractFactory.Product.Checkbox;
import Creational.AbstractFactory.Product.MacButton;
import Creational.AbstractFactory.Product.MacCheckbox;

public class MacFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
    
}
