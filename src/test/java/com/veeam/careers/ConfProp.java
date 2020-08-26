package com.veeam.careers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProp {
    private static FileInputStream fileInputStream;
    private static Properties PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream("src/test/resources/config.properties");
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