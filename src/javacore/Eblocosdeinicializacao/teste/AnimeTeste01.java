package javacore.Eblocosdeinicializacao.teste;

import javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        System.out.println(anime.getNome());

    }
}
