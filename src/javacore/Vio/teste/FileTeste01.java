package javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste01 {

	public static void main(String[] args) {
		File file = new File("/home/caio/Estudos/DevDojo/Java/Arquivos/TesteFile01.txt");
		
		try {
			boolean isCreated = file.createNewFile();
			System.out.println("Arquivo foi criado? " + isCreated);
			
			boolean exists = file.exists();
			
			if(exists) {
				System.out.println("Arquivo exite? " + file.exists());
				
				Long dataEmLong = file.lastModified();
				Date data = new Date(dataEmLong);
				
				System.out.println("última modificação: " + data);
			}
		}
		catch (IOException e) {
			e.printStackTrace();			
		}
		
	}

}
