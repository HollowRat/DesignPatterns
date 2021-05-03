package by.minilooth.lab.controllers;

import by.minilooth.lab.beans.interfaces.Vehicle;
import by.minilooth.lab.observer.EventManager;
import by.minilooth.lab.observer.impls.VehicleEventListener;

import java.util.ArrayList;
import java.util.List;

public class VehicleController {

    private static VehicleController instance;

    private final List<Vehicle> vehicles;
    private final EventManager<List<Vehicle>> eventManager;

    private VehicleController() {
        vehicles = new ArrayList<>();
        eventManager = new EventManager<>("update");

        eventManager.subscribe("update", new VehicleEventListener());
    }

    public static VehicleController getInstance() {
        if (instance == null) {
            instance = new VehicleController();
        }
        return instance;
    }

    public void add(Vehicle vehicle) {
        if (vehicles.stream().noneMatch(v -> v.getId().equals(vehicle.getId()))) {
            vehicles.add(vehicle);
            eventManager.notify("update", vehicles);
        }
        else {
            System.out.println("Vehicle with this id is already exists");
        }
    }

    public void delete(Integer id) {
        if (vehicles.stream().anyMatch(v -> v.getId().equals(id))) {
            vehicles.removeIf(v -> v.getId().equals(id));
            eventManager.notify("update", vehicles);
        }
        else {
            System.out.println("Vehicle with this id is not exists");
        }
    }

}
