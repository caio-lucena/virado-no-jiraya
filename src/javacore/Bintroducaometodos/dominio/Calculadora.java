package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public int somarDoisNumeros(int a, int b) {
        return a + b;
    }

    public int subtrairDoisNumeros(int a, int b) {
        return a - b;
    }

    public void dividirDoisNumeros(int a, int b) {
        if (b == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(a / b);
    }

    public int imprimirArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        return soma;
    }

    public int imprimirVarArgs(int... numeros){
        int soma = 0;

        for(int num: numeros){
            soma += num;
        }
        return  soma;
    }
}
