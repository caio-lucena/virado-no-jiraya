package javacore.Oexception.teste;

public class StackOverflowTeste {
    public static void main(String[] args) {

        var condicao = true;

        while(condicao){

            try{
                metodoRecursivo();
            }
            catch (StackOverflowError ex){
                condicao = false;
            }

            System.out.println("Parando o programa");
        }
    }

    public static void metodoRecursivo(){
        System.out.println("Causando uma exception...");

        metodoRecursivo();
    }
}
