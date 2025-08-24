package com.guilhermearcora.arrayListAndDataCollection.modelos;

public class Basquete extends Esporte{

    public Basquete(String nome){
        super(nome);
    }

    @Override
    public String toString() {
        return "Time: " + this.getNome();
    }

}
