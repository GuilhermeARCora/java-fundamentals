package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double A,n,R;

        n = 3.14159;

        R = Double.parseDouble(in.readLine());

        A = n * (R*R);

        System.out.println("A=%.4f".formatted(A));



    }

}
