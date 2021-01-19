package com.solvd.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteReadProperties {
    public void setValueToProperties (String path, String key, String value) {
        Properties properties = new Properties();
        try{
            FileOutputStream fileStream = new FileOutputStream(path, true);
            properties.setProperty(key, value);
            properties.store(fileStream, "");
            fileStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getValueFromProperties (String path, String key) {
        Properties properties = new Properties();
        try{
            FileInputStream fileStream = new FileInputStream(path);
            properties.load(fileStream);
            fileStream.close();
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
