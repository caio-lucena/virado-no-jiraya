package javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        var menu = """
                Software de previão do futuro.
                Digite sua pergunta e eu responderei com SIM ou NÃO.
                """;

        System.out.println(menu);

        String pergunta = entrada.nextLine();

        boolean condicao = (!pergunta.isEmpty()) && (!pergunta.isBlank()) && (pergunta.charAt(0) == ' ');

        if (condicao) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        entrada.close();
    }
}
