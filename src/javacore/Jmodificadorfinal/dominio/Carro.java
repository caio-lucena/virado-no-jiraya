package javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;

    private final Comprador COMPRADOR = new Comprador();

    static {
        VELOCIDADE_LIMITE = 180;
    }

    public final void imprimir() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
}
