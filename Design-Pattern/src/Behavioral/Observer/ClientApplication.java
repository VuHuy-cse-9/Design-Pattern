package Behavioral.Observer;

public class ClientApplication {
    public void main() {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener();
        editor.event.subscribe(logger);

        EmailAlertsListener emailAlert = new EmailAlertsListener();
        editor.event.subscribe(emailAlert);

        editor.openFile();

        editor.saveFile();
    }
}
