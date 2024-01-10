package javacore.Kenumdominio.teste;

import javacore.Kenumdominio.dominio.Maquininha;

public class MaquininhaTeste01 {
    public static void main(String[] args) {
        Maquininha maquininha1 = new Maquininha("Pic Pay", Maquininha.TipoPagamentoInterno.DEBITO);
        Maquininha maquininha2 = new Maquininha("Alelo", Maquininha.TipoPagamentoInterno.CREDITO);

        System.out.println(maquininha1);
        System.out.println(maquininha2);

        System.out.println(maquininha1.getTipoPagamento().devolverTipoPagamento("Débito"));

    }
}
