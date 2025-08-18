package com.guilhermearcora.basics;

import com.guilhermearcora.basics.modelos.Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Guilherme");

        String textoMenu =
                """
                        ***********************
                        Dados iniciais do cliente:
                        
                        Nome: %s
                        Tipo conta: %s
                        Saldo inicial: R$ %.2f
                        ***********************
                        
                        Operações
                        
                        1- Consultar saldos
                        2- Receber valor
                        3- Transferir valor
                        4- Sair
                        
                        Digite a opção desejada:     
                """.formatted(novoCliente.getNome(),novoCliente.getTipoConta(),novoCliente.getSaldo());
        System.out.println(textoMenu);
        int opcao = scanner.nextInt();

        boolean sair = false;
        while (!sair){
            double valor;

            System.out.println(textoMenu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(novoCliente.getSaldo());
                    break;
                case 2:
                    System.out.println("Informe o valor a ser depositado:");
                    valor = scanner.nextDouble();
                    novoCliente.receberValor(valor);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido:");
                    valor = scanner.nextDouble();
                    novoCliente.transferirValor(valor);
                    break;
                case 4:
                    System.out.println(novoCliente.sair());
                    sair = true;
                    break;
            }

        }

    }
}
