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
 * [] : range
 * ?  : zero ou uma ocorrência
 * *  : zero ou mais ocorrências
 * +  : uma ou mais ocorrências
 * 
 * {n,m} : valores específicos de n até m
 * 
 * () : agrupamento
 * |  : ou exemplo o(c|v)o busca 'oco' ou 'ovo'
 * $  : fim da linha
 * .  : encontra tudo que conter algum dos elementos. Exemplo 1.3 pode entrontrar 123, 1@3, 1A3, 133
 */

public class PatternMatcherTeste01 {

	public static void main(String[] args) {
		String regex = "Luffy";
		String texto = "Luffy do Chapéu de palha é o Luffytaro de Wano";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) {
			System.out.println("Posição: " + matcher.start() + ", valor encontrado: " + matcher.group());
		}

	}

}
