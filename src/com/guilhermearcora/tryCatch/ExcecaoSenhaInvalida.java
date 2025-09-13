package com.guilhermearcora.tryCatch;

import com.guilhermearcora.tryCatch.exceptions.SenhaInvalidaException;
import com.guilhermearcora.tryCatch.modelos.User;

import java.util.Scanner;

public class ExcecaoSenhaInvalida {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite uma senha");
            User user = new User(scanner.nextLine());
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

}
