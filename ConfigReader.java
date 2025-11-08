package com.infrrd.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop = new Properties();

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
        } catch (Exception e) {
            System.out.println("Could not load config.properties, using defaults. Error: " + e.getMessage());
        }
    }

    public static String get(String key, String defaultVal) {
        return prop.getProperty(key, defaultVal);
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
