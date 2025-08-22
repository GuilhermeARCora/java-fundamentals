package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1010 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int code1,units1,code2,units2;
        double unitPrice1, unitPrice2, totalAmount;

        StringTokenizer st = new StringTokenizer(in.readLine());
        code1 = Integer.parseInt(st.nextToken());
        units1 = Integer.parseInt(st.nextToken());
        unitPrice1 = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(in.readLine());
        code2 = Integer.parseInt(st.nextToken());
        units2 = Integer.parseInt(st.nextToken());
        unitPrice2 = Double.parseDouble(st.nextToken());

        totalAmount = (units1*unitPrice1) + (units2*unitPrice2);

        System.out.println("VALOR A PAGAR: R$ %.2f".formatted(totalAmount));

    }
}
