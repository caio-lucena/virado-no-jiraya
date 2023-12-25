package javacore.Gassociacao.exercicio.teste;

import javacore.Gassociacao.exercicio.dominio.Aluno;
import javacore.Gassociacao.exercicio.dominio.Local;
import javacore.Gassociacao.exercicio.dominio.Professor;
import javacore.Gassociacao.exercicio.dominio.Seminario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            Local local = new Local("Konoha, vila da folha");
            Aluno aluno1 = new Aluno("Sasuke", 14);
            Aluno aluno2 = new Aluno("Pain", 15);
            Aluno[] alunos = {aluno1, aluno2};

            Professor professor1 = new Professor("Kakashi Sensei", "Sharingan");

            Seminario seminario = new Seminario("Técnicas ninjas", local, alunos);
            professor1.setSeminarios(new Seminario[]{seminario});

            seminario.imprimirSeminario();
            System.out.println("********");
            professor1.imprimirProfessor();

        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Favor verificar dados de entrada " + ex.getMessage());
        } finally {
            entrada.close();
        }
    }
}
