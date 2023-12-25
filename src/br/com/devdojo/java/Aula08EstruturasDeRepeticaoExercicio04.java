package br.com.devdojo.java;

public class Aula08EstruturasDeRepeticaoExercicio04 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela = 1;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            valorParcela = valorCarro/parcela;

            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Pagamento em " + parcela + " de R$ " + valorParcela);

        }
    }
}
