package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Riquelme");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador j : jogadores) {
            System.out.println(j.imprimirJogador());
        }
    }
}
