package br.com.devdojo.java;

public class Aula02TiposPrimitivos {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        int numero = 18;
        
		long numeroLong = 1000000;
        float salarioFloat = 2500.0F;
        double salarioDouble = 2500.0;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        //casting

        int castingNumber = (int) 10000000000L;

        System.out.println("A idade é " + numero + " anos");
        System.out.println(caractere);
        System.out.println("Casting number = " + castingNumber);

    }
}
