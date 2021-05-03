package by.minilooth.lab.utils;

import by.minilooth.lab.beans.impls.WheelDriveType;

import java.util.HashMap;
import java.util.Map;

public class WheelDriveFactory {

    private static final Map<String, WheelDriveType> wheelDriveTypes = new HashMap<>();

    public static WheelDriveType createWheelDrive(String type) {
        return wheelDriveTypes.computeIfAbsent(type, newType -> new WheelDriveType(type));
    }

}
