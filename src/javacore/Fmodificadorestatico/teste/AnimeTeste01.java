package javacore.Fmodificadorestatico.teste;

import javacore.Fmodificadorestatico.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Akudama Drive");
        
        System.out.println("Anime: " + anime1.getNome() + ", qtd de episódios = " + anime1.getEpisodios().length);

    }
}
