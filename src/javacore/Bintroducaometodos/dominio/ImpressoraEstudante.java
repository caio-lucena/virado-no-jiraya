package javacore.Bintroducaometodos.dominio;

/*
* Importante: ao invés de alterar um objeto que foi passado como parâmetro,
* as boas práticas de programação nos diz para criarmos uma cópia deste objeto
* e então devolver esse clone com as devidadas alterações
* */

public class ImpressoraEstudante {

    public void imprimirEstudante(Estudante estudante){
        System.out.println("Nome: " + estudante.nome + ", idade: " + estudante.idade + ", sexo: " + estudante.sexo);
    }
}
