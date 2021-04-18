package by.minilooth.lab.factories.impls;

import by.minilooth.lab.beans.impls.engines.PetrolEngine;
import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.factories.EngineFactory;

public class PetrolEngineFactory implements EngineFactory {

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

}
