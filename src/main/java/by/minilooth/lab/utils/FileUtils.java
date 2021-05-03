package by.minilooth.lab.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

public class FileUtils {

    public static String generateFilename(String path) {
        String filename;

        do {
           filename = generateFilename();
        }
        while(new File(path + filename).exists());

        return filename;
    }

    private static String generateFilename() {
        return RandomStringUtils.randomAlphanumeric(10) + ".txt";
    }

}
