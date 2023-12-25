package br.com.devdojo.java;

public class Aula08EstruturasDeRepeticaoExercicio02 {
    public static void main(String[] args) {

        int tamanho = 50;

        for(int i = 1; i <= tamanho; i++){
            System.out.println("Valor do i = " + i);

            if(i == 25){
                break;
            }
        }

    }
}
