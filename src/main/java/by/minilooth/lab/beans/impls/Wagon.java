package by.minilooth.lab.beans.impls;

import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.beans.interfaces.Transmission;
import by.minilooth.lab.beans.interfaces.Vehicle;

public class Wagon implements Vehicle {

    private String type = "Универсал";
    private String brand;
    private String model;
    private Integer yearOfIssue;
    private Engine engine;
    private Transmission transmission;
    private Float mileage;
    private Float fuelTankVolume;
    private Float currentFuelTankVolume;
    private Float trunkVolume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public Float getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(Float fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }

    public Float getCurrentFuelTankVolume() {
        return currentFuelTankVolume;
    }

    public void setCurrentFuelTankVolume(Float currentFuelTankVolume) {
        this.currentFuelTankVolume = currentFuelTankVolume;
    }

    public Float getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(Float trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @Override
    public void refuel(Float liters) {

    }

    @Override
    public void openDoors() {

    }

    @Override
    public void closeDoors() {

    }

    @Override
    public void openHood() {

    }

    @Override
    public void closeHood() {

    }

    @Override
    public void openTrunk() {

    }

    @Override
    public void closeTrunk() {

    }

    public static class Builder {

        private final Wagon wagon;

        private Builder() {
            wagon = new Wagon();

        }

        public Builder brand(String brand) {
            wagon.brand = brand;
            return this;
        }

        public Builder model(String model) {
            wagon.model = model;
            return this;
        }

        public Builder yearOfIssue(Integer yearOfIssue) {
            wagon.yearOfIssue = yearOfIssue;
            return this;
        }

        public Builder engine(Engine engine) {
            wagon.engine = engine;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            wagon.transmission = transmission;
            return this;
        }

        public Builder mileage(Float mileage) {
            wagon.mileage = mileage;
            return this;
        }

        public Builder fuelTankVolume(Float fuelTankVolume) {
            wagon.fuelTankVolume = fuelTankVolume;
            return this;
        }

        public Builder currentFuelTankVolume(Float currentFuelTankVolume) {
            wagon.currentFuelTankVolume = currentFuelTankVolume;
            return this;
        }

        public Builder trunkVolume(Float trunkVolume) {
            wagon.trunkVolume = trunkVolume;
            return this;
        }

        public Wagon build() {
            return wagon;
        }

    }

}
