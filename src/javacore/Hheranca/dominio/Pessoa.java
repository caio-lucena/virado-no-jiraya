package javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco não estático 1 de Pessoa");
    }
    {
        System.out.println("Dentro do bloco não estático 2 de Pessoa");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do construtor básico de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this(nome);
        System.out.println("Dentro do construtor completo de Pessoa");
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);

        if(endereco != null){
            System.out.println("Endereço: " + this.endereco.getRua() + ", cep: " + this.endereco.getCep());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
