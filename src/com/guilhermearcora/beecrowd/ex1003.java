package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1003 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A,B, SOMA;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        SOMA = A+B;

        System.out.println("SOMA = " + SOMA);
    }
}
