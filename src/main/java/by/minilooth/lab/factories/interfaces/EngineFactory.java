package by.minilooth.lab.factories.interfaces;

import by.minilooth.lab.beans.interfaces.Engine;

public interface EngineFactory {

    Engine createEngine(Integer countOfCylinders, Float horsePowers, Float torque, Float volume);

}
