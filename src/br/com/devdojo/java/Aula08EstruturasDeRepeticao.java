package br.com.devdojo.java;
//while, do while, for

public class Aula08EstruturasDeRepeticao {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            System.out.println(++contador);
        }

        contador = 12;

        do {
            System.out.println("Dentro do do-while");
        } while (contador < 10);

        for (int i = 0; i <= contador; i += 3) {
            System.out.println("Valor do i = " + i);
        }

    }
}
