package Behavioral.Observer;

public class EmailAlertsListener implements EventListeners{
    @Override
    public void update(String msg) {
        System.out.println("Email Alert Listener " + msg);
    }
}
