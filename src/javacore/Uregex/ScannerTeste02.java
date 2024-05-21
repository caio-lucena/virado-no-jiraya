package javacore.Uregex;

import java.util.Scanner;

public class ScannerTeste02 {

	public static void main(String[] args) {
		String nomes = "Lufffy,Tonny Chopper,Robin,3000,false";
		
		Scanner scanner = new Scanner(nomes);
		scanner.useDelimiter(",");
		
		while(scanner.hasNext()) {
			
			if(scanner.hasNextInt()) {
				int inteiro = scanner.nextInt();		
				System.out.println("Inteiro: " + inteiro);
			}
			else if (scanner.hasNextBoolean()) {
				boolean booleano = scanner.nextBoolean();
				System.out.println("Booleano: " + booleano);
			}
			else {
				System.out.println("String: " + scanner.next());
			}
		}
		
		scanner.close();

	}

}
