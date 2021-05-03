package by.minilooth.lab.factories.impls.engines;

import by.minilooth.lab.beans.impls.engines.PetrolEngine;
import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.factories.interfaces.EngineFactory;

public class PetrolEngineFactory implements EngineFactory {

    @Override
    public Engine createEngine(Integer countOfCylinders, Float horsePowers, Float torque, Float volume) {
        return new PetrolEngine(countOfCylinders, horsePowers, torque, volume);
    }

}
