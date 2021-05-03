package by.minilooth.lab.beans.impls.engines;

import by.minilooth.lab.beans.interfaces.abstracts.AbstractEngine;

public class DieselEngine extends AbstractEngine {

    private final String type = "Diesel";
    private Integer countOfCylinders;
    private Float horsePowers;
    private Float torque;
    private Float volume;
    private Boolean started = false;

    public DieselEngine() { }

    public DieselEngine(Integer countOfCylinders, Float horsePowers, Float torque, Float volume) {
        this.countOfCylinders = countOfCylinders;
        this.horsePowers = horsePowers;
        this.torque = torque;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public Integer getCountOfCylinders() {
        return countOfCylinders;
    }

    public void setCountOfCylinders(Integer countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }

    public Float getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(Float horsePowers) {
        this.horsePowers = horsePowers;
    }

    public Float getTorque() {
        return torque;
    }

    public void setTorque(Float torque) {
        this.torque = torque;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    @Override
    public void start() {
        if (!started) {
            this.started = true;
            System.out.println("Diesel engine started");
        }
        else {
            System.out.println("Diesel engine already started");
        }
    }

    @Override
    public void stop() {
        if (!started) {
            this.started = false;
            System.out.println("Diesel engine stopped");
        }
        else {
            System.out.println("Diesel engine already stopped");
        }
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "type='" + type + '\'' +
                ", countOfCylinders=" + countOfCylinders +
                ", horsePowers=" + horsePowers +
                ", torque=" + torque +
                ", volume=" + volume +
                ", started=" + started +
                '}';
    }

}
