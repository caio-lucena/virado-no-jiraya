package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Cosme");
        Professor professor2 = new Professor("Carmela");

        Escola escola1 = new Escola("Liberatti");
        Escola escola2 = new Escola("Ceneart");

        Professor[] professores = {professor1, professor2};

        escola1.setProfessores(professores);
        escola1.imprimirEscola();
        escola2.imprimirEscola();

    }
}
