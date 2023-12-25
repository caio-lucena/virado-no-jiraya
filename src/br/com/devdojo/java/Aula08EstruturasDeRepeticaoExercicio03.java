package br.com.devdojo.java;
/*
 * dado o valor de um carro, descubra em quqntas parcelas ele pode ser parcelado
 * Condição: valor da parcela >= 1000
 * */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aula08EstruturasDeRepeticaoExercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double valorCarro = 30000;
        double valorParcela = 0;

        try {

            for(int i = 1; i <= 1000; i++){
                valorParcela = valorCarro/i;

                System.out.println("Pagamento em " + i + " vezes de R$ " + valorParcela);

                if(valorParcela <= 1000){
                   break;
                }
            }

        } catch (InputMismatchException ex) {
            System.out.println("Favor verificar dados de entrada");
        } finally {
            scanner.close();
        }


    }
}
