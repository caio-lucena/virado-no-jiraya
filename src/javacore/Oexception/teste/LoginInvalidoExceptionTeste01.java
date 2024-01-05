package javacore.Oexception.teste;

import javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Usuário: ");
            String user = scanner.nextLine();

            System.out.print("Senha: ");
            String password = scanner.nextLine();

            String login = logar(user, password);
            System.out.println(login);

        }
        catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }

    private static String logar(String login, String senha) throws LoginInvalidoException {
        boolean condicao = login.equals("Goku") && senha.equals("ssj");

        if (condicao) {
            return "Login bem sucedido";
        }
        else {
            throw new LoginInvalidoException("Usuário ou senha incorretos.");
        }
    }
}
