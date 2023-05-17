package publisher;

import listener.EventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final  List<EventListener> listeners;

    public EventManager() {
      listeners = new ArrayList<>();
    }

    public void subscribe(EventListener listener)
    {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener)
    {
        listeners.remove(listener);
    }

    public void notify()
    {
        listeners.forEach(listener -> listener.update());
    }
}
