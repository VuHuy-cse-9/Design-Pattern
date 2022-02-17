package Creational.AbstractFactory;

import Creational.AbstractFactory.Creator.GUIFactory;
import Creational.AbstractFactory.Creator.MacFactory;
import Creational.AbstractFactory.Creator.WinFactory;

public class ClientApplicationConfig {
    public void main(String OS) {
        GUIFactory factory;
        if (OS == "Windows") {
            factory = new WinFactory();
        }
        else if (OS == "Mac"){
            factory = new MacFactory(); 
        }
        else {
            throw new ArithmeticException("Operating system not found");
        }
        ClientApplication app = new ClientApplication(factory);
        app.start();
    }
}
