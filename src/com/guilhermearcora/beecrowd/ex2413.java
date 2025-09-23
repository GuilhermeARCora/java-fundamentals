package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2413 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert the number");
        int third = Integer.parseInt(in.readLine());
        int second = 2*third;
        int first = second*2;

        System.out.println(first);

    }

}
