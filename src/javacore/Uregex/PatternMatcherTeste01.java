package javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {

	public static void main(String[] args) {
		String regex = "Luffy";
		String texto = "Luffy do Chapéu de palha é o Luffytaro de Wano";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) {
			System.out.println(matcher.start());
		}

	}

}
