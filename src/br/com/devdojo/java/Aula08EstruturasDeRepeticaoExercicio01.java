package br.com.devdojo.java;
//imprima todos os números pares de 0 a 10

public class Aula08EstruturasDeRepeticaoExercicio01 {
    public static void main(String[] args) {

        int tamanho = 100;

        for (int i = 0; i <= tamanho; i ++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
