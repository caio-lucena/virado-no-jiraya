package javacore.QString.teste;

public class TesteStringPerformance {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatenar(100_000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo decorrido para String = " + (fim - inicio) + " ms");

        System.out.println("####");

        inicio = System.currentTimeMillis();
        concatenarBuilder(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo decorrido para StringBuilder = " + (fim - inicio) + " ms");

        System.out.println("####");

        inicio = System.currentTimeMillis();
        concatenarBuffer(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo decorrido para o StringBuffer = " + (fim - inicio) + " ms");

    }

    public static void concatenar(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    public static void concatenarBuilder(int tamanho){
        StringBuilder stringBuilder = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++){
            stringBuilder.append(i);
        }
    }

    public static void concatenarBuffer(int tamanho){
        StringBuffer stringBuffer = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++){
            stringBuffer.append(i);
        }
    }
}
