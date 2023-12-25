package br.com.devdojo.java;

public class Aula06EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 15;

        boolean categoriaInfantil = idade < 15;
        boolean categoriaJunior = idade >= 15 && idade < 18;
        String categoria;

        if(categoriaJunior){
            categoria = "Jogador é do juniores";
        } else if (categoriaInfantil) {
            categoria = "Jogador é da base";
        } else {
            categoria = "Jogador profissional";
        }

        System.out.println(categoria);
    }
}
