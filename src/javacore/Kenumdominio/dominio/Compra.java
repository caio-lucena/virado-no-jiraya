package javacore.Kenumdominio.dominio;

public class Compra {
    private double valorCompra;
    private TipoPagamento tipoPagamento;

    public Compra(double valorCompra, TipoPagamento tipoPagamento) {
        this.valorCompra = valorCompra;
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Compra [" +
                "valorCompra = " + String.format("%.2f",valorCompra) +
                ", tipoPagamento = " + tipoPagamento +
                ']';
    }
}
