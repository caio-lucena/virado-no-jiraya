package javacore.Kenumdominio.dominio;

public class Maquininha {
    public enum TipoPagamentoInterno {
        DEBITO(1, "Débito"),
        CREDITO(2, "Crédito");

        private final int VALOR;
        private String nomeRelatorio;

        TipoPagamentoInterno(int valor, String nomeRelatorio) {
            this.VALOR = valor;
            this.nomeRelatorio = nomeRelatorio;
        }

        public String getNomeRelatorio() {
            return nomeRelatorio;
        }

        public TipoPagamentoInterno devolverTipoPagamento(String tipoPagamento){

            for(TipoPagamentoInterno tipoPgt: values()){
                if (tipoPgt.getNomeRelatorio().equals(tipoPagamento)){
                    return tipoPgt;
                }
            }
            return null;
        }

        public int getVALOR() {
            return VALOR;
        }

    }

    private String marca;
    private TipoPagamentoInterno tipoPagamento;

    public Maquininha(String marca, TipoPagamentoInterno tipoPagamento) {
        this.marca = marca;
        this.tipoPagamento = tipoPagamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoPagamentoInterno getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamentoInterno tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Maquininha [" +
                "marca = '" + marca + '\'' +
                ", tipoPagamento = " + tipoPagamento.getVALOR() +
                ", tipoPagamento = " + tipoPagamento.getNomeRelatorio()+
                ']';
    }
}
