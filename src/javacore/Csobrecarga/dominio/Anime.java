package javacore.Csobrecarga.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    public void imprimir(){
        System.out.println("Anime: " + this.nome + ", tipo: " + this.tipo + ", episódios: " + this.episodios);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
