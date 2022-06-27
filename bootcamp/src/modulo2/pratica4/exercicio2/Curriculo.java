package modulo2.pratica4.exercicio2;

import java.util.Arrays;

public class Curriculo extends Documento {
    private Pessoa pessoa;
    private String[] habilidades;

    public Curriculo(Pessoa pessoa, String[] habilidades) {
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidades=" + Arrays.toString(habilidades) +
                '}';
    }
}
