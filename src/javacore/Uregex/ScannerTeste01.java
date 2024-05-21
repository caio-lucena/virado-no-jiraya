package javacore.Uregex;

public class ScannerTeste01 {

	public static void main(String[] args) {
		String texto = "Levi, Erin, Mikasa";
		String[] nomes = texto.split(",");
		
		for (String vetor: nomes) {
			System.out.println(vetor.trim());
		}
	}

}
