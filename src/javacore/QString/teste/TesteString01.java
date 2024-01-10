package javacore.QString.teste;

public class TesteString01 {

	public static void main(String[] args) {
		
		String nome1 = "Caio";
		String nome2 = "Caio";
		
		boolean comparacao = nome1 == nome2;
		
		if(comparacao) {
			System.out.println("Estão no mesmo pool de constantes do Java ? "  + comparacao);
		}
		
		nome2.concat(" Lucena");		
		
		System.out.println("As Strings continuam no mesmo pool ? " + comparacao);
		
		String nome3 = new String("Caio");
		
		System.out.println(nome1 == nome3.intern());
	}

}
