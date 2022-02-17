package Creational.FactoryMethod;
import Creational.FactoryMethod.Creator.*;

public class ClientApplication {
    private Dialog dialog;
    
    void initialize(String OS) {
    	if (OS == "Windows") {
    		this.dialog = new WindowsDialog();
    	}
    	else if (OS == "Web"){
    		this.dialog = new WebDialog();
    	}
    	else {
    		throw new ArithmeticException("No operating system match!");
    	}
    }
    
    public void main(String OS) {
    	try {
    		this.initialize(OS);
    	} catch(ArithmeticException error) {
    		System.out.println(error);
    		return;
    	}
    	this.dialog.render();
    }
}