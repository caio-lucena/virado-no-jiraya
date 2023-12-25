package javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    private static final Double IMPOSTO_PORCENTAGEM = 0.19;

    public Televisao(String nome, Double valor){
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
