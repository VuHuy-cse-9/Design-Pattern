package Behavioral.Observer;

public class LoggingListener implements EventListeners{

    @Override
    public void update(String msg) {
        System.out.println("Logging Listener " + msg);
    }
    
}
