package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Akihabara","334455");
        Pessoa pessoa = new Pessoa("Oda");

        pessoa.setCpf("12345-67");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

    }
}
