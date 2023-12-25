package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Time time = new Time("Inter Miami");

        jogador.setTime(time);
        System.out.println(jogador.imprimirJogador());
    }
}
