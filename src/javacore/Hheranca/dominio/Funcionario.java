package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco não estático 1 de Funcionário");
    }
    {
        System.out.println("Dentro do bloco não estático 2 de Funcionário");
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        System.out.println("Dentro do contrutor de Funcionário");
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Salário R$ %.2f%n", salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
