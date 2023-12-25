package javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    private  static final Double IMPOSTO_PORCENTAGEM = 0.06;

    private Integer validadeEmDias;

    public Tomate(String nome, Double valor){
        super(nome, valor);
    }

    public Tomate(String nome, Double valor, Integer validadeEmDias) {
        super(nome, valor);
        this.validadeEmDias = validadeEmDias;
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_PORCENTAGEM;
    }

    public Integer getValidadeEmDias() {
        return validadeEmDias;
    }

    public void setValidadeEmDias(Integer validadeEmDias) {
        this.validadeEmDias = validadeEmDias;
    }
}
