package javacore.Oexception.exception;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        try {
            dividir(1d, 0d);
        }
        catch (RuntimeException ex){
            ex.printStackTrace();
        }

        System.out.println("Passou do catch...");
    }
    private static Double dividir(Double a, Double b) {
        return a/b;
    }
}
