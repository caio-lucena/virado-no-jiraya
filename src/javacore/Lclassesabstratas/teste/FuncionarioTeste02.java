package javacore.Lclassesabstratas.teste;

import javacore.Lclassesabstratas.dominio.BancoDeDados;
import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.LinguagemProgramacao;

public class FuncionarioTeste02 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Caio Lucena", 6500.0, LinguagemProgramacao.JAVA);
        desenvolvedor.setBancoDeDados(BancoDeDados.MYSQL);
        System.out.println(desenvolvedor);
    }
}
