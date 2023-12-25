package javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimir(){
        System.out.println("Nome: " + this.nome + ", idade: " + this.idade + ", sexo: " + this.sexo);
    }

}
