package by.minilooth.lab;

import by.minilooth.lab.beans.impls.vehicles.Sedan;
import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.beans.interfaces.Transmission;
import by.minilooth.lab.beans.interfaces.Vehicle;
import by.minilooth.lab.controllers.VehicleController;
import by.minilooth.lab.facade.JsonToXmlConverterFacade;
import by.minilooth.lab.factories.interfaces.EngineFactory;
import by.minilooth.lab.factories.interfaces.TransmissionFactory;
import by.minilooth.lab.factories.impls.transmissions.ManualTransmissionFactory;
import by.minilooth.lab.factories.impls.engines.PetrolEngineFactory;
import by.minilooth.lab.utils.JsonConverter;
import by.minilooth.lab.utils.WheelDriveFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        VehicleController vehicleController = VehicleController.getInstance();
        EngineFactory engineFactory = new PetrolEngineFactory();
        TransmissionFactory transmissionFactory = new ManualTransmissionFactory();

        Engine engine = engineFactory.createEngine(4, 110f, 195f, 1.8f);
        Transmission transmission = transmissionFactory.createTransmission(5);

        Vehicle vehicle = Sedan.builder()
                                .id(1)
                                .brand("BMW")
                                .model("3 series")
                                .yearOfIssue(1995)
                                .engine(engine)
                                .transmission(transmission)
                                .wheelDriveType(WheelDriveFactory.createWheelDrive("Rear"))
                                .mileage(10000f)
                                .build();

        vehicleController.add(vehicle);

        JsonToXmlConverterFacade jsonToXmlConverterFacade = new JsonToXmlConverterFacade();

        String json = JsonConverter.convert(vehicle);
        String xml = jsonToXmlConverterFacade.convert(json);

        System.out.println(engine.writeToFile());

        System.out.println(xml);
    }

}
