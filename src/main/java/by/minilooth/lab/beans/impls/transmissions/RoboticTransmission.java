package by.minilooth.lab.beans.impls.transmissions;

import by.minilooth.lab.beans.interfaces.Transmission;

public class RoboticTransmission implements Transmission {

    private final String type = "Robotic";
    private Integer countOfGears;

    public RoboticTransmission() { }

    public RoboticTransmission(Integer countOfGears) {
        this.countOfGears = countOfGears;
    }

    public Integer getCountOfGears() {
        return countOfGears;
    }

    public void setCountOfGears(Integer countOfGears) {
        this.countOfGears = countOfGears;
    }

    @Override
    public String getType() {
        return type;
    }

}
