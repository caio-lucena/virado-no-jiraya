package javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \d : todos os dígitos
 * \D : todos os não dígitos
 * \s : todos os espaços em branco (inclui \n, \t, \f, \t
 * \S : todos os caracteres que não estão em branco
 * \w : todos os caracteres de a-z, A-Z, dígitos e _ (underscore)
 * \W : todos os caracteres que não estiverem inclusos no \w
 */

public class PatternMatcherTeste02 {

	public static void main(String[] args) {
		String regex = "\\d";
		String texto = "Luffy do Chapéu de palha, recompensa: 3 bilhões de Berries";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		while (matcher.find()) {
			System.out.println("Posição: "+ matcher.start() + ", valor encontrado: " + matcher.group());
		}

	}

}
