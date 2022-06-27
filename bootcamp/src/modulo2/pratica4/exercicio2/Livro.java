package modulo2.pratica4.exercicio2;

import java.util.Arrays;

public class Livro extends Documento {
    private int qtdePaginas;
    private String nomeAutor, titulo, genero;

    public Livro(int qtdePaginas, String nomeAutor, String titulo, String genero) {
        this.qtdePaginas = qtdePaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "qtdePaginas=" + qtdePaginas +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
