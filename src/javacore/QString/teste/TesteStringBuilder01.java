package javacore.QString.teste;

public class TesteStringBuilder01 {
    public static void main(String[] args) {
        String nome = "Caio Lucena";
        nome.concat(" Dev Dojo");

        System.out.println(nome);
        nome.substring(0,3); // exclusivo: tamanho -1

        System.out.println(nome);
        System.out.println(nome.substring(0,3));

        StringBuilder sb = new StringBuilder("Caio Lucena"); //padrão 16 no construtor
        sb.append(" Dev Dojo").append(" Academy");

        System.out.println(sb);
        System.out.println("Lendo olhando pro espelho... " + sb.reverse());

    }
}
