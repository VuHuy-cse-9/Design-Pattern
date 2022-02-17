package Creational.FactoryMethod.Creator;

import Creational.FactoryMethod.Product.Button;
import Creational.FactoryMethod.Product.WindowsButton;

public class WindowsDialog extends Dialog{
    public Button createButton() {
        return new WindowsButton();
    }
}
