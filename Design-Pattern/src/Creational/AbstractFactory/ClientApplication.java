package Creational.AbstractFactory;

import Creational.AbstractFactory.Creator.GUIFactory;
import Creational.AbstractFactory.Product.Button;
import Creational.AbstractFactory.Product.Checkbox;

public class ClientApplication {
    private GUIFactory factory;
    public ClientApplication(GUIFactory factory) {
        this.factory = factory;
    }
    void start() {
        Button button = this.factory.createButton();
        Checkbox checkbox = this.factory.createCheckbox();
        button.onClick();
        checkbox.onCheck();
    }
}