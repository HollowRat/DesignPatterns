package by.minilooth.lab.beans.impls.engines;

import by.minilooth.lab.beans.interfaces.Engine;

public class ElectricEngine implements Engine {

    private final String type = "Электро";
    private String name;
    private Float horsePowers;
    private Float torque;

    public ElectricEngine() { }

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
