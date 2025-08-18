package com.guilhermearcora.poo;

import com.guilhermearcora.poo.modelos.MinhasPreferidas;
import com.guilhermearcora.poo.modelos.Musica;
import com.guilhermearcora.poo.modelos.Podcast;

public class Main {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("November Rain");
        minhaMusica.setArtista("Guns N' Roses");

        for (int i = 0; i < 1000;i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 1000;i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000;i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000;i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
