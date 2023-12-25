package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome + ", idade: " + this.salario + ", salário R$ " + this.salario);
    }

    public void calcularMedia() {
        double media = 0;

        for (int i = 0; i < salario.length; i++) {
            media += salario[i];
        }

        media /= salario.length;

        System.out.printf("A média de salário é R$ %.2f%n", media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
