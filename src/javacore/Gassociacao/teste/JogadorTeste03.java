package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Time time1 = new Time("Seleção Brasileira");
        Time time2 = new Time("Seleção Argentina");

        Jogador jogador1 = new Jogador("Fenômeno");
        Jogador jogador2 = new Jogador("Cafu");

        time1.setJogadores(new Jogador[] {jogador1, jogador2});

        time1.imprimirTime();
        time2.imprimirTime();

    }
}
