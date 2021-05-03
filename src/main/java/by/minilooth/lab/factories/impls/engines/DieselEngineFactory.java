package by.minilooth.lab.factories.impls.engines;

import by.minilooth.lab.beans.impls.engines.DieselEngine;
import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.factories.interfaces.EngineFactory;

public class DieselEngineFactory implements EngineFactory {

    @Override
    public Engine createEngine(Integer countOfCylinders, Float horsePowers, Float torque, Float volume) {
        return new DieselEngine(countOfCylinders, horsePowers, torque, volume);
    }

}
