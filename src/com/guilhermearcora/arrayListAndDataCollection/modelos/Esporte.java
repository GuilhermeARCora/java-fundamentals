package com.guilhermearcora.arrayListAndDataCollection.modelos;

import java.util.ArrayList;
import java.util.List;

public class Esporte implements  Comparable<Esporte>{

    private String nome;
    private String modalidade;
    private boolean olimpico;
    private int numAtletasEmUmaPartida;
    private String campeonato;
    private List<Esporte> equipes = new ArrayList<>();
    private int numeroTitulos;

    public Esporte(String nome){
        this.nome = nome;
    }

    public void addEquipe(List<Esporte> equipes){
        this.equipes.addAll(equipes);
    }

    public void printEquipes() {
        this.equipes.forEach(equipe -> System.out.println(equipe.toString()));
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public boolean isOlimpico() {
        return olimpico;
    }

    public void setOlimpico(boolean olimpico) {
        this.olimpico = olimpico;
    }

    public int getNumAtletasEmUmaPartida() {
        return numAtletasEmUmaPartida;
    }

    public void setNumAtletasEmUmaPartida(int numAtletasEmUmaPartida) {
        this.numAtletasEmUmaPartida = numAtletasEmUmaPartida;
    }

    public String getCampeonato() {
        if(this.campeonato == null || this.campeonato.isEmpty()){
            this.campeonato = "Sem campeonato";
        }
        return this.campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(int numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    @Override
    public int compareTo(Esporte outroEsporte) {
        return this.getNome().compareTo(outroEsporte.getNome());
    }
}
