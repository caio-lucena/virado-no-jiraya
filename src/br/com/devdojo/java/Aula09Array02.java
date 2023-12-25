package br.com.devdojo.java;

public class Aula09Array02 {
    public static void main(String[] args) {
        int tamanho = 3;
        int[] arrayIdades = new int[tamanho];

        arrayIdades[0] = 8;
        arrayIdades[1] = 11;
        arrayIdades[2] = 17;

        System.out.println("As versões LTS do Java são: ");

        for(int i = 0; i < arrayIdades.length; i++){
            System.out.print(arrayIdades[i] + " ");
        }
    }
}
