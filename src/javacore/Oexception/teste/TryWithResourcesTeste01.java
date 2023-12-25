package javacore.Oexception.teste;

import javacore.Oexception.dominio.Leitor01;
import javacore.Oexception.dominio.Leitor02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivoNewSchool02();
    }

    public static void lerArquivoOldSchool(){
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        }
        catch (IOException ex){
            System.out.println("Catch");
        }
        finally {

            try {
                if(reader != null){
                    reader.close();
                }
            }catch (IOException ex){
                System.out.println("Catch do catch...");
            }
        }
    }

    public static void lerArquivoNewSchool01(){

        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))){
            System.out.println("lendo arquivo");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public static void lerArquivoNewSchool02(){
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()){

            var frase = """
                    O Java fecha os recursos na ordem INVERSA do que foi declarado quando usamos o try with resources
                    """;

            System.out.println(frase);

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
