package com.veeam.careers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfPropReader {
    private static final String PATH = "src/test/resources/config.properties";

    private static FileInputStream fileInputStream;
    private static Properties PROPERTIES;


    static {
        try {
            fileInputStream = new FileInputStream(PATH);
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}