package javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    private static final Double IMPOSTO_PORCENTAGEM = 0.21;

    public Computador(String nome, Double valor){
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
