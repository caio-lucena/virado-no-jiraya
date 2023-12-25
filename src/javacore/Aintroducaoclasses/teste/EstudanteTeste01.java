package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Toyohisa";
        estudante.idade = 15;
        estudante.sexo = 'M';

        System.out.println("Nome " + estudante.nome);
        System.out.println("Idade " + estudante.idade);
        System.out.println("Sexo " + estudante.sexo);
    }
}
