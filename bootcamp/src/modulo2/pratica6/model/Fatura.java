package modulo2.pratica6.model;

import modulo2.pratica6.util.ListaDeItens;

import java.util.ArrayList;

public class Fatura {
    private Cliente cliente;
    private ListaDeItens itens;
    private double valorTotal;

    public Fatura(Cliente cliente, ListaDeItens itens) {
        this.cliente = cliente;
        this.itens = itens;
        double valor = 0;
        for (Item item : itens.consultarTodos()) {
            valor += item.getValorUnitario() * item.getQuantidade();
        }
        this.setValorTotal(valor);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ListaDeItens getItens() {
        return itens;
    }

    public void setItens(ListaDeItens itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
