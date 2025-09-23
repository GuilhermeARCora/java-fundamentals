package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1153 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int factorial = n * (n-1);

        for(int i = 2; i < n; i++){
            factorial *= (n-i);
        }

        System.out.println(factorial);

    }

}
