package javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		
		//ResourceBundle bundle = ResourceBundle.getBundle("language_pt_BR", Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("language", new Locale("en", "US"));
		
		if(bundle.containsKey("hello")) {
			System.out.println(bundle.getString("hello"));
		}
		
		bundle = ResourceBundle.getBundle("language", new Locale("pt", "BR"));
		
		if(bundle.containsKey("hello")) {
			System.out.println(bundle.getString("hello"));
		}
		
		if (bundle.containsKey("word")) {
			System.out.println(bundle.getString("word"));
		}
		
	}

}
