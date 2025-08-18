package com.guilhermearcora.basics.modelos;

public class Cliente {

    private String nome;
    private String tipoConta = "Corrente";
    private double saldo = 2500.00;

    public void receberValor(double valor){
        this.saldo += valor;
    }

    public void transferirValor(double valor){
        this.saldo -= valor;
    }

    public String sair(){
        return "Volte sempre!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
