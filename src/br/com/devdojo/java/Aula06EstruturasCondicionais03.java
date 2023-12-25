//Operador ternário SEMPRE precisa guardar o valor em algum lugar

package br.com.devdojo.java;

public class Aula06EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6500;
        String mensagemDoacao = salario >= 5000d ? "vamos doar": "não podemos doar agora";

        System.out.println(mensagemDoacao);

    }
}
