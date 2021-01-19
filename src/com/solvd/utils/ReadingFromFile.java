package com.solvd.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public String readFromFile (String path) {
        String res = "";
        BufferedReader rf = null;
        try{
            rf = new BufferedReader(new FileReader(path));
            String line;
            while ((line = rf.readLine()) != null){
                res += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                rf.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return res;
    }
}
