package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1007 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A,B,C,D, DIFERENCA;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        C = Integer.parseInt(in.readLine());
        D = Integer.parseInt(in.readLine());

        DIFERENCA = (A*B)-(C*D);

        System.out.println("DIFERENCA = %d".formatted(DIFERENCA));
    }
}
