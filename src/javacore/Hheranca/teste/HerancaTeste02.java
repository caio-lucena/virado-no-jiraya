package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Grand Line", "1000");
        Funcionario funcionario = new Funcionario("Aramaki","332211",endereco, 15000.0);

        funcionario.imprimir();

    }
}
