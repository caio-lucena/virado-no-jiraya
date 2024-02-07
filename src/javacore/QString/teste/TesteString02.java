package javacore.QString.teste;

public class TesteString02 {
    public static void main(String[] args) {
        String nome = "Luffy";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("L","R"));

        System.out.println(nome.substring(0, 2)); // exclusivo
        System.out.println(nome.substring(1, nome.length()));

    }
}
