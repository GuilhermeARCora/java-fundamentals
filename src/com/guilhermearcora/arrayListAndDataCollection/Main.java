package com.guilhermearcora.arrayListAndDataCollection;

import com.guilhermearcora.arrayListAndDataCollection.modelos.Basquete;
import com.guilhermearcora.arrayListAndDataCollection.modelos.Esporte;
import com.guilhermearcora.arrayListAndDataCollection.modelos.Futebol;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Futebol meuTime = new Futebol("Goiás");
        meuTime.setCampeonato("Brasileiro A");
        meuTime.setNacional(true);

        var timeDoAmigo = new Futebol("Cyla Nova");
        timeDoAmigo.setCampeonato("Brasileiro C");
        timeDoAmigo.setNacional(true);

        var timeBasquete = new Basquete("Golden State Warriors");

        List<Esporte> novosTimes = List.of(meuTime,timeDoAmigo,timeBasquete);

        meuTime.addEquipe(novosTimes);

        meuTime.setNumeroTitulos(27);
        timeDoAmigo.setNumeroTitulos(15);

        ArrayList<Integer> titulos = new ArrayList();
        titulos.add(meuTime.getNumeroTitulos());
        titulos.add(timeDoAmigo.getNumeroTitulos());

        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println(titulos);


    }

}
