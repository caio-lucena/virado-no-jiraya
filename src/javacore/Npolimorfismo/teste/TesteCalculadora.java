package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TesteCalculadora {
    public static void main(String[] args) {

        Computador computador = new Computador("Inspiron", 3000.0);
        Tomate tomate = new Tomate("Tomate Dev Dojo", 10.0);
        Produto tv = new Televisao("Samsumg 50\"", 3000.0);
        Produto tomatao = new Tomate("Tomatão",10.50, 3);

        tomate.setValidadeEmDias(3);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tomatao);
        CalculadoraImposto.calcularImposto(tv);

        System.out.println(tomatao.getValor());

    }
}
