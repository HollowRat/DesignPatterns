package by.minilooth.lab.observer;

public interface EventListener<T> {

    void update(String eventType, T t);

}
