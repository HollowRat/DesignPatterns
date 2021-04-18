package by.minilooth.lab.beans.impls;

import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.beans.interfaces.Transmission;
import by.minilooth.lab.beans.interfaces.Vehicle;

public class Coupe implements Vehicle {

    private String type = "Купе";
    private String brand;
    private String model;
    private Integer yearOfIssue;
    private Engine engine;
    private Transmission transmission;
    private Float mileage;
    private Float fuelTankVolume;
    private Float currentFuelTankVolume;

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

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final Coupe coupe;

        private Builder() {
            coupe = new Coupe();
        }

        public Builder brand(String brand) {
            coupe.brand = brand;
            return this;
        }

        public Builder model(String model) {
            coupe.model = model;
            return this;
        }

        public Builder yearOfIssue(Integer yearOfIssue) {
            coupe.yearOfIssue = yearOfIssue;
            return this;
        }

        public Builder engine(Engine engine) {
            coupe.engine = engine;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            coupe.transmission = transmission;
            return this;
        }

        public Builder mileage(Float mileage) {
            coupe.mileage = mileage;
            return this;
        }

        public Builder fuelTankVolume(Float fuelTankVolume) {
            coupe.fuelTankVolume = fuelTankVolume;
            return this;
        }

        public Builder currentFuelTankVolume(Float currentFuelTankVolume) {
            coupe.currentFuelTankVolume = currentFuelTankVolume;
            return this;
        }

        public Coupe build() {
            return coupe;
        }

    }

}
