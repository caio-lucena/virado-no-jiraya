package br.com.devdojo.java;

public class Aula07SwitchCaseExercicioCorrecao02 {
    public static void main(String[] args) {
        byte dia = 6;

        switch (dia){
            case 1,7 -> {
                System.out.println("Fim de semana");
            }
            case 2,3,4,5,6 ->{
                System.out.println("Dia útil");
            }

        }
    }
}
