package javacore.Kenumdominio.teste;

import javacore.Kenumdominio.dominio.Compra;
import javacore.Kenumdominio.dominio.TipoPagamento;

public class CompraTeste01 {
    public static void main(String[] args) {
        Compra compra = new Compra(250.0, TipoPagamento.DEBITO);
        double desconto = compra.getTipoPagamento().aplicarDesconto(250);

        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);

    }
}
