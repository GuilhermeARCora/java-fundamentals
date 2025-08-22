package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1008 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int num, workedHours;
        double amountPerHour, salary;

        num = Integer.parseInt(in.readLine());
        workedHours = Integer.parseInt(in.readLine());
        amountPerHour = Double.parseDouble(in.readLine());

        salary = workedHours * amountPerHour;

        System.out.println("NUMBER = %d".formatted(num));
        System.out.println("SALARY = U$ %.2f".formatted(salary));

    }
}
