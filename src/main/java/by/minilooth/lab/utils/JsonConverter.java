package by.minilooth.lab.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonConverter {

    private static final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static <T> void convert(T object, String filename) {
        try (FileWriter fw = new FileWriter(filename)) {
            mapper.writeValue(fw, object);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static <T> String convert(T object) {
        try {
            return mapper.writeValueAsString(object);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static <T> T parse(Class<T> clazz, String filename) {
        try (FileReader fr = new FileReader(filename)) {
            return mapper.readValue(fr, clazz);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
