package com.guilhermearcora.beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2006 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int tea = Integer.parseInt(in.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(in.readLine());

        while(st.hasMoreTokens()){
            int guess = Integer.parseInt(st.nextToken());
            if(guess == tea) count++;
        }

        System.out.println(count);
    }

}
