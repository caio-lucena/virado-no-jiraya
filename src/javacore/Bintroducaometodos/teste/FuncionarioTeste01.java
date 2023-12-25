package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.setNome("Asokah");
        funcionario1.setIdade(15);
        funcionario1.setSalario(new double[]{1100.0, 1300.0, 900.0});

        funcionario2.setNome("Kylo Ren");
        funcionario2.setIdade(20);
        funcionario2.setSalario(new double[]{15000.0, 17500.0, 30000.0});

        funcionario1.imprimir();
        funcionario2.imprimir();

        funcionario1.calcularMedia();
        funcionario2.calcularMedia();


    }
}
