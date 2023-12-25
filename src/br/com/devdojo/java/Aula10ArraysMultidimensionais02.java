package br.com.devdojo.java;
//TODO rever a aula 38

public class Aula10ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3};

        int[][] arrayElegante = {{1, 2}, {1, 3, 5, 7, 9}, {2, 4, 6}};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[7];

        for (int[] arrayExterno : arrayInt) {
            for (int arrayInterno : arrayExterno) {
                System.out.print(arrayInterno + " ");
            }
            System.out.println();
        }

        System.out.println("-----");

        for (int[] arrayExterno : arrayElegante) {
            for (int arrayInterno : arrayExterno) {
                System.out.print(arrayInterno + " ");
            }
            System.out.println("\n-----");
        }
    }
}
