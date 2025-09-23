package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1016 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int distance = Integer.parseInt(in.readLine());
        int z = distance*2;

        System.out.println(z + " minutos");

    }

}
