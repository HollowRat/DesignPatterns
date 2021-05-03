package by.minilooth.lab.beans.interfaces.abstracts;

import by.minilooth.lab.beans.interfaces.Engine;
import by.minilooth.lab.utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;

public abstract class AbstractEngine implements Engine {

    @Override
    public final String writeToFile() throws IOException {
        String filename = FileUtils.generateFilename("./");

        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(this.toString());
        }

        return filename;
    }

}
