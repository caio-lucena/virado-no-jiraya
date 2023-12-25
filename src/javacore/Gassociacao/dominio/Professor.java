package javacore.Gassociacao.dominio;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprimirProfessor() {
        System.out.println("Nome do professor: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
