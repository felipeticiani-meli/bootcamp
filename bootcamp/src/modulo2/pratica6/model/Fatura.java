package modulo2.pratica6.model;

import java.util.List;

public class Fatura {
    private Cliente cliente;
    private List<Item> itens;
    private double valorTotal;

    public Fatura(Cliente cliente, List<Item> itens) {
        this.cliente = cliente;
        this.itens = itens;
        this.setValorTotal(itens.stream().mapToDouble((a) -> a.getValorUnitario()).sum());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
