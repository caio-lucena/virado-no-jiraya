package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {

        if (produto instanceof Tomate) {
            System.out.printf("Produto: %s, preço: R$ %.2f, imposto a ser pago: R$ %.2f, válido por %d dias %n",
                    produto.getNome(), produto.getValor(), produto.calcularImposto(), ((Tomate) produto).getValidadeEmDias());
        } else {
            System.out.printf("Produto: %s, preço: R$ %.2f, imposto a ser pago: R$ %.2f%n",
                    produto.getNome(), produto.getValor(), produto.calcularImposto());
        }

    }
}
