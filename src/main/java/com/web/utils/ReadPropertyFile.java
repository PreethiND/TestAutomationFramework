package com.web.utils;

import com.web.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile() {
    }

    private static Properties property = new Properties();

    static {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(FrameworkConstants.getConfigFilePath());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            property.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) throws Exception {
        if (Objects.isNull(property.getProperty(key)) || Objects.isNull(key))
            throw new Exception("Invalid Property name: " + key + " is not a valid property name");
        else return property.getProperty(key);
    }
}
