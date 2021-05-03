package by.minilooth.lab.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager<T> {

    private final Map<String, List<EventListener<T>>> listenersMap = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listenersMap.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener<T> listener) {
        List<EventListener<T>> listeners = listenersMap.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener<T> listener) {
        List<EventListener<T>> listeners = listenersMap.get(eventType);
        listeners.remove(listener);
    }

    public void notify(String eventType, T t) {
        List<EventListener<T>> listeners = listenersMap.get(eventType);
        for (EventListener<T> listener : listeners) {
            listener.update(eventType, t);
        }
    }

}
