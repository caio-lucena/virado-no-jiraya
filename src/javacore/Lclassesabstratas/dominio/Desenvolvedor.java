package javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    LinguagemProgramacao linguagemProgramacao;
    BancoDeDados bancoDeDados;
    public Desenvolvedor(String nome, double salario, LinguagemProgramacao linguagemProgramacao) {
        super(nome, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public Desenvolvedor(String nome, double salario, LinguagemProgramacao linguagemProgramacao, BancoDeDados bancoDeDados) {
        super(nome, salario);
        this.linguagemProgramacao = linguagemProgramacao;
        this.bancoDeDados = bancoDeDados;
    }

    public LinguagemProgramacao getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(LinguagemProgramacao linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public BancoDeDados getBancoDeDados() {
        return bancoDeDados;
    }

    public void setBancoDeDados(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    @Override
    public String toString() {
        return "Desenvolvedor:" + "\n" +
                "Nome: " + nome  + "\n" +
                "Linguaguem de programação: " + linguagemProgramacao.imprimirNome() + "\n" +
                "Banco de dados: " + bancoDeDados.imprimirNome() + "\n" +
                "Salário: R$ " + String.format("%.2f",salario);
    }
}
