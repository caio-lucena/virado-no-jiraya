package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somarDoisNumeros(2,6));
        calculadora.subtrairDoisNumeros(86, 5);
        calculadora.dividirDoisNumeros(5, 0);

    }
}
