package main;

public class Pessoa {

    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero.toLowerCase();
    }

    public boolean isFeminino() {
        return this.genero.equals("feminino");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
