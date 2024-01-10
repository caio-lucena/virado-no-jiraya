package javacore.PWrapperClasses.teste;

public class TesteWrapperClass01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte byteP = 1;
		short shortP = 1;
		int intP = 1;
		long longP =1L;
		float floatP = 10F;
		double doubleP = 10;
		char charP = '1';
		boolean booleanP = false;
				
		Byte byteW = 1;
		Short shortW = 1;
		Integer intW = 1;
		Long longW =1L;
		Float floatW = 10F;
		Double doubleW = 10d;
		Character charW = 'W';
		Boolean booleanW = false;
		
		int i = intW;
		
		System.out.println("Método que faz um casting..." + intW.longValue());		
		System.out.println("É um dígito? " + Character.isDigit(charP));

	}

}
