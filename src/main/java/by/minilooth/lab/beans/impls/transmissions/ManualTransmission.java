package by.minilooth.lab.beans.impls.transmissions;

import by.minilooth.lab.beans.interfaces.Transmission;

public class ManualTransmission implements Transmission {

    private final String type = "Manual";
    private Integer countOfGears;

    public ManualTransmission() {}

    public ManualTransmission(Integer countOfGears) {
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
