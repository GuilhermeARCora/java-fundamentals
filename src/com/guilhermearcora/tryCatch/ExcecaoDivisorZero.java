package com.guilhermearcora.tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcecaoDivisorZero {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Insira o dividendo");
            int dividendo = Integer.parseInt(in.readLine());

            System.out.println("Insira o divisor");
            int divisor = Integer.parseInt(in.readLine());

            double divisao = dividendo / divisor;

            System.out.println(divisao);
        }catch (ArithmeticException e) {
            System.out.println("O divisor não pode ser 0: "+ e.getMessage() );
        }

    }

}
