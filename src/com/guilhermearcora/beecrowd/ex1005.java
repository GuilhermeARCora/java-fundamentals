package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1005 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double A,B, MEDIA;

        A = Double.parseDouble(in.readLine()) * 3.5;
        B = Double.parseDouble(in.readLine()) * 7.5;

        MEDIA = (A+B)/ 11;

        System.out.println("MEDIA = %.5f".formatted(MEDIA));

    }

}
