package modulo2.pratica5.model;

import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> listaDeVeiculos;

    public Garagem(int id, List<Veiculo> listaDeVeiculos) {
        this.id = id;
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }
}
