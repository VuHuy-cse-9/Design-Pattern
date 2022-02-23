package Behavioral.Observer;

public class Editor {
    public EventManager event;

    public Editor() {
        event = new EventManager();
    }

    public void openFile() {
        event.notify("Open file!");
    }

    public void saveFile() {
        event.notify("Save file!");
    }
}
