package javacore.Jmodificadorfinal.teste;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.getCOMPRADOR().setNome("Kuririn");
        System.out.println(carro.getCOMPRADOR().getNome());
        System.out.println(carro.getCOMPRADOR());
        carro.getCOMPRADOR().setNome("Jiraya");
        System.out.println(carro.getCOMPRADOR());

        Comprador comprador = carro.getCOMPRADOR();

        System.out.println(comprador);
    }
}
