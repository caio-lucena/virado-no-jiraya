package javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    static {
        System.out.println("Dentro do bloco de inicialização estático");

        for (int i = 0; i < Anime.episodios.length; i++) {
            System.out.print(episodios[i] + " ");
        }
        System.out.println();
    }

    public Anime(){}
    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
