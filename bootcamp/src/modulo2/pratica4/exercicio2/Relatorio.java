package modulo2.pratica4.exercicio2;

import java.util.Arrays;

public class Relatorio extends Documento {
    private String texto, autor, revisor;
    private int qtdePaginas;

    public Relatorio(String texto, String autor, String revisor, int qtdePaginas) {
        this.texto = texto;
        this.autor = autor;
        this.revisor = revisor;
        this.qtdePaginas = qtdePaginas;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "texto='" + texto + '\'' +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                ", qtdePaginas=" + qtdePaginas +
                '}';
    }
}
