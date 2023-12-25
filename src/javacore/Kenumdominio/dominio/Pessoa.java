package javacore.Kenumdominio.dominio;

public class Pessoa {
    private String nome;
    private TipoCliente tipoCliente;

    public Pessoa(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipoCliente = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Pessoa [" +
                "nome = '" + nome + '\'' +
                ", tipo = " + tipoCliente +
                ']';
    }
}
