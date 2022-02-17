package Creational.AbstractFactory.Creator;

import Creational.AbstractFactory.Product.Button;
import Creational.AbstractFactory.Product.Checkbox;

public abstract class GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
