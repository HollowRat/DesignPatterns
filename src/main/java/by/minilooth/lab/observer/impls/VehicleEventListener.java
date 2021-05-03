package by.minilooth.lab.observer.impls;

import by.minilooth.lab.utils.JsonConverter;
import by.minilooth.lab.beans.interfaces.Vehicle;
import by.minilooth.lab.observer.EventListener;

import java.util.List;

public class VehicleEventListener implements EventListener<List<Vehicle>> {

    @Override
    public void update(String eventType, List<Vehicle> vehicles) {
        JsonConverter.convert(vehicles, "vehicles.json");
    }

}
