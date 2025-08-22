package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1006 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double A,B,C, MEDIA;

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());

        MEDIA = ((A*2)+(B*3)+(C*5))/10;

        System.out.println("MEDIA = %.1f".formatted(MEDIA));

    }

}
