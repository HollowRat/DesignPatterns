package by.minilooth.lab.factories.impls.transmissions;

import by.minilooth.lab.beans.impls.transmissions.AutomaticTransmission;
import by.minilooth.lab.beans.interfaces.Transmission;
import by.minilooth.lab.factories.interfaces.TransmissionFactory;

public class AutomaticTransmissionFactory implements TransmissionFactory {

    @Override
    public Transmission createTransmission(Integer countOfGears) {
        return new AutomaticTransmission(countOfGears);
    }

}
