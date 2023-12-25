package javacore.Kenumdominio.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double aplicarDesconto(double valor);
}
