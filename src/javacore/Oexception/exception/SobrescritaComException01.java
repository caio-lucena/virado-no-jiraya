package javacore.Oexception.exception;

import java.io.FileNotFoundException;

import javacore.Oexception.dominio.Funcionario;
import javacore.Oexception.dominio.LoginInvalidoException;
import javacore.Oexception.dominio.Pessoa;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        
        try {
			pessoa.salvar();
		} catch (FileNotFoundException | LoginInvalidoException e) {			
			e.printStackTrace();
		}
        
        funcionario.salvar();

    }
}
