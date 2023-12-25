package br.com.devdojo.java;

public class Aula07SwitchCaseExercicio {
    public static void main(String[] args) {
        byte diaDaSemana = 1;

        switch (diaDaSemana){
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
