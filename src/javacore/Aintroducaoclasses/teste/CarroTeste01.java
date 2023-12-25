package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Pálio";
        carro1.modelo = "Super Turbo";
        carro1.ano = 1997;

        carro2.nome = "Gol";
        carro2.modelo = "4x4";
        carro2.ano = 2002;

        System.out.println("Carro: " + carro1.nome + ", " + carro1.modelo + ", " + carro1.ano);
        System.out.println("Carro: " + carro2.nome + ", " + carro2.modelo + ", " + carro2.ano);

        System.out.println("\n" + carro1);
        System.out.println(carro2);

        carro1 = carro2;

        System.out.println("\n" + carro1);
        System.out.println(carro2);


    }
}
