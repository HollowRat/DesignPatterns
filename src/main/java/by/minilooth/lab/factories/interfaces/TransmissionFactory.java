package by.minilooth.lab.factories.interfaces;

import by.minilooth.lab.beans.interfaces.Transmission;

public interface TransmissionFactory {

    Transmission createTransmission(Integer countOfGears);

}
