package by.minilooth.lab.factories.impls;

import by.minilooth.lab.beans.impls.transmissions.RoboticTransmission;
import by.minilooth.lab.beans.interfaces.Transmission;
import by.minilooth.lab.factories.TransmissionFactory;

public class RoboticTransmissionFactory implements TransmissionFactory {

    @Override
    public Transmission createTransmission() {
        return new RoboticTransmission();
    }

}
