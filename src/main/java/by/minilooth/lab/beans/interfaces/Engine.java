package by.minilooth.lab.beans.interfaces;

import java.io.IOException;

public interface Engine {

    void start();
    void stop();
    String writeToFile() throws IOException;

}
