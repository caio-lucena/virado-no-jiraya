package br.com.devdojo.java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aula06EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double salario = 0.0;
        double porcentagemImposto = 0.0;
        double impostoAPagar = 0.0;

        try {
            System.out.print("Digite seu salário anual: ");
            salario = scanner.nextDouble();

            if (salario <= 34712){
                porcentagemImposto = 9.7/100;

            } else if (salario >= 34713 && salario <= 68507) {
                porcentagemImposto = 37.35/100;

            } else {
                porcentagemImposto = 49.5/100;
            }
            impostoAPagar = salario * porcentagemImposto;

            System.out.printf("Imposto a pagar $ %.2f%n", impostoAPagar);

        }catch (InputMismatchException ex){
            System.out.println("Favor validar dados de entrada");
        }
        finally {
            scanner.close();
        }

    }
}
