package javacore.Csobrecarga.teste;

import javacore.Csobrecarga.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Akudama Drive");
        anime.setTipo("Ação");
        anime.setEpisodios(12);

        anime.imprimir();
    }
}
