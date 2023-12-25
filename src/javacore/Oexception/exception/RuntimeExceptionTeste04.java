package javacore.Oexception.exception;

import java.util.Scanner;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        abrirConexao(scanner);
    }

    private static void abrirConexao(Scanner scanner) {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }
        catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        finally {
            System.out.println("Fechando recurso liberado pelo SO");
            scanner.close();
        }
    }
}
