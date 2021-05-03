package by.minilooth.lab.beans.impls.transmissions;

import by.minilooth.lab.beans.interfaces.Transmission;

public class AutomaticTransmission implements Transmission {

    private final String type = "Automatic";
    private Integer countOfGears;

    public AutomaticTransmission() { }

    public AutomaticTransmission(Integer countOfGears) {
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
