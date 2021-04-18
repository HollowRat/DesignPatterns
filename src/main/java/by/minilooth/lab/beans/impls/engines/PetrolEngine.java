package by.minilooth.lab.beans.impls.engines;

import by.minilooth.lab.beans.interfaces.Engine;

public class PetrolEngine implements Engine {

    private final String type = "Бензиновый";
    private String name;
    private Float horsePowers;
    private Float torque;
    private Integer countOfCylinders;
    private Float volume;

    private Boolean isStarted;

    public PetrolEngine() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getCountOfCylinders() {
        return countOfCylinders;
    }

    public void setCountOfCylinders(Integer countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Boolean getStarted() {
        return isStarted;
    }

    public void setStarted(Boolean started) {
        isStarted = started;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

}
