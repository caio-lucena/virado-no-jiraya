package javacore.Kenumdominio.teste;

import javacore.Kenumdominio.dominio.Pessoa;
import javacore.Kenumdominio.dominio.TipoCliente;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Akira", TipoCliente.PESSOA_FISICA);
        Pessoa pessoa2 = new Pessoa("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
