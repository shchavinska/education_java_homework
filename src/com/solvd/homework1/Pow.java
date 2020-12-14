package com.solvd.homework1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pow {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number ");
        int n = Integer.parseInt(reader.readLine());

        int result = 1;
        for (int i=0; i<n; i++)
            result *= a;

        System.out.println(a + " to the " + n + " power = " + result);
    }
}
