package br.com.devdojo.java;

public class Aula10ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] calendario = new int[3][3];

        calendario[0][0] = 31;
        calendario[0][1] = 28;
        calendario[0][2] = 31;

        calendario[1][0] = 30;
        calendario[1][1] = 31;
        calendario[1][2] = 30;

        for (int i = 0; i < calendario.length; i++){
            for (int j = 0; j < calendario[i].length; j++){
                System.out.print(calendario[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] arrayExterno: calendario){
            for(int arrayInterno: arrayExterno){
                System.out.print(arrayInterno + " ");
            }
            System.out.println();
        }
    }
}
