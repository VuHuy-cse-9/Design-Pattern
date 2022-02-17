package Creational.FactoryMethod.Creator;

import Creational.FactoryMethod.Product.Button;
import Creational.FactoryMethod.Product.HTMLButton;

public class WebDialog extends Dialog{

    @Override
    public Button createButton() {
        // TODO Do a business logic here
        return new HTMLButton();
    }
    
}
