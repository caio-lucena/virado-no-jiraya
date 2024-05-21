package javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {

	public static void main(String[] args) {
		File file = new File("/home/caio/Estudos/DevDojo/Java/Arquivos/FileTeste02.txt");
		
		try (FileWriter fileWriter = new FileWriter(file, true)){
			
			fileWriter.write("Escrevendo qualquer coisa \nSó pra testar");
			fileWriter.flush();
			
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
