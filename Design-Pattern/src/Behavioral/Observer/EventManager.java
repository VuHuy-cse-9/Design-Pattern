package Behavioral.Observer;

import java.util.ArrayList;

public class EventManager {
    private ArrayList<EventListeners> listeners;

    public EventManager() {
        this.listeners = new ArrayList<>();
    }

    public void subscribe(EventListeners listener) {
        this.listeners.add(listener);
    }

    public void unsubscribe(EventListeners listener) {

    }

    public void notify(String msg) {
        for (EventListeners listener : this.listeners) {
            listener.update(msg);
        }
    }
}
