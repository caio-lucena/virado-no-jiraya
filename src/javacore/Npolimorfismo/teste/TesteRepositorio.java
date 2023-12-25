package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.repositorio.RepositorioArquivo;

public class TesteRepositorio {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
