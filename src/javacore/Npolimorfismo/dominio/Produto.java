package javacore.Npolimorfismo.dominio;

import javacore.Npolimorfismo.servico.Taxavel;

public abstract  class Produto implements Taxavel {
    protected String nome;
    protected Double valor;
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
