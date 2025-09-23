package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2374 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int desired = Integer.parseInt(in.readLine());
        int current = Integer.parseInt(in.readLine());

        System.out.println(desired-current);

    }

}
