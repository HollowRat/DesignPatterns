package by.minilooth.lab.beans.impls.vehicles;

import by.minilooth.lab.beans.impls.WheelDriveType;
import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.beans.interfaces.Transmission;
import by.minilooth.lab.beans.interfaces.Vehicle;

public class Coupe implements Vehicle {

    private Integer id;
    private final String type = "Купе";
    private String brand;
    private String model;
    private Integer yearOfIssue;
    private Engine engine;
    private Transmission transmission;
    private WheelDriveType wheelDriveType;
    private Float mileage;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
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

    public WheelDriveType getWheelDriveType() {
        return wheelDriveType;
    }

    public void setWheelDriveType(WheelDriveType wheelDriveType) {
        this.wheelDriveType = wheelDriveType;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final Coupe coupe;

        private Builder() {
            coupe = new Coupe();
        }

        public Builder id(Integer id) {
            coupe.id = id;
            return this;
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

        public Builder wheelDriveType(WheelDriveType wheelDriveType) {
            coupe.wheelDriveType = wheelDriveType;
            return this;
        }

        public Coupe build() {
            return coupe;
        }

    }

}
