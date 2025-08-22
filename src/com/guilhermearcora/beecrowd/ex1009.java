package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1009 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String name;
        double salary,totalSales;

        name = in.readLine();
        salary = Double.parseDouble(in.readLine());
        totalSales = Double.parseDouble(in.readLine());

        salary += 0.15 * totalSales;

        System.out.println("TOTAL = R$ %.2f".formatted(salary));

    }
}
