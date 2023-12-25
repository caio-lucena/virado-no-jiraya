package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] vetor = {3, 2, 7};

        System.out.println(calculadora.imprimirArray(vetor));
        System.out.println(calculadora.imprimirVarArgs(1,2,3,4,5));

    }
}
