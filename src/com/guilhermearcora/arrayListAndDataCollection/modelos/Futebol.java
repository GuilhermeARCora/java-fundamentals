package com.guilhermearcora.arrayListAndDataCollection.modelos;

public class Futebol extends Esporte{


    private boolean nacional;

    public Futebol(String nome){
        super(nome);
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    @Override
    public String toString() {
        return "Time: " + this.getNome() + " (" + getCampeonato() + ") ";
    }
}
