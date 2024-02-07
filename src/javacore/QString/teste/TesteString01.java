package javacore.QString.teste;

public class TesteString01 {

	public static void main(String[] args) {
		
		String nome1 = "Caio";
		String nome2 = "Caio";

		System.out.println("As Strings estão no mesmo pool ? " + (nome1 == nome2));

		nome2.concat(" Lucena");		
		
		System.out.println("As Strings continuam no mesmo pool ? " + (nome1 == nome2));

		String nome3 = new String("Caio");

		System.out.println( "nome1 == nome3 ? "+ (nome1 == nome3));
		
		System.out.println(nome1 == nome3.intern());
	}

}
