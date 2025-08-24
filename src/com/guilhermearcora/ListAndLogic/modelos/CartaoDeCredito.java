package com.guilhermearcora.ListAndComparable.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito{

    private double limite;
    private String item;
    private double valorDaCompra;
    private List<String> carrinho = new ArrayList<>();
    private double acumaladoGasto = 0;
    private double saldo = 0;

    public void setLimite(double limite){
        this.limite = limite;
    }

    public void setItem(String item){
        this.item = item;
    }

    public void setValorDaCompra(double valor){

        if(this.getLimite() < this.getAcumuladoGasto() + valor){
            System.out.println("Saldo insuficiente!");
            System.out.println("COMPRAS REALIZADAS:" );
            this.getCarrinho().forEach(item -> System.out.println(item));
            System.out.println("Saldo do cartão: " + this.getSaldo());
            return;
        }

        this.valorDaCompra = valor;
        this.setCarrinho();
        this.setAcumuladoGasto(valor);
        this.setSaldo();
    }

    private void setCarrinho(){
        this.carrinho.add(this.item + " - " + this.valorDaCompra);
    }

    public List getCarrinho(){
        return this.carrinho;
    }

    public double getLimite(){
        return  this.limite;
    }

    private void setAcumuladoGasto(double valor){
        this.acumaladoGasto += valor;
    }

    public double getAcumuladoGasto(){
        return this.acumaladoGasto;
    }

    private void setSaldo(){
        this.saldo = this.limite - this.acumaladoGasto;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
