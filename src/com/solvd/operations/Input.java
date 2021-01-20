package com.solvd.operations;

import com.solvd.exceptions.InputExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static int intInput() throws InputExceptions {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        }catch (IOException e){
            throw new InputExceptions(e.getMessage());
        }catch (NumberFormatException e){
            throw new InputExceptions("Can't parse integer.");
        }
    }

    public static String strInput() throws InputExceptions {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new InputExceptions(e.getMessage());
        }
    }
}
