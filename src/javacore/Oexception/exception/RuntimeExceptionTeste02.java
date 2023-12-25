package javacore.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo/teste.txt");

        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo " + isCriado);
        }
        catch (IOException ex){
            ex.printStackTrace();
            throw ex;
        }
    }
}
