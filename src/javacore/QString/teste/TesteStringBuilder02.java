package javacore.QString.teste;

public class TesteStringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Luffy");
        sb.delete(0,2);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int index = sb.indexOf("y");
        System.out.println(index);
    }
}
