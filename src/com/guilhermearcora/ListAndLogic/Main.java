package com.guilhermearcora.ListAndComparable;

import com.guilhermearcora.ListAndComparable.modelos.CartaoDeCredito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        CartaoDeCredito novaCompra = new CartaoDeCredito();

        System.out.println("Digite o limite do cartão:");
        novaCompra.setLimite(Double.parseDouble(in.readLine()));

        System.out.println("Digite a descrição da compra:");
        novaCompra.setItem(in.readLine());

        System.out.println("Digite o valor da compra: ");
        novaCompra.setValorDaCompra(Double.parseDouble(in.readLine()));

        System.out.println("Compra realizada!\n" +
                "\n" +
                "Digite 0 para sair ou 1 para continuar");
        int num = Integer.parseInt(in.readLine());

        while (num > 0){

            System.out.println("Digite a descrição da compra:");
            novaCompra.setItem(in.readLine());

            System.out.println("Digite o valor da compra: ");
            novaCompra.setValorDaCompra(Double.parseDouble(in.readLine()));

            System.out.println("Compra realizada!\n" +
                    "\n" +
                    "Digite 0 para sair ou 1 para continuar");
            num = Integer.parseInt(in.readLine());

        }

        if(num == 0){
            System.out.println("COMPRAS REALIZADAS:");
            novaCompra.getCarrinho().forEach(item -> System.out.println(item));
            System.out.println("Saldo do cartão: " + novaCompra.getSaldo());
        }

    }

}
