package modulo2.pratica6.util;

import modulo2.pratica6.model.Item;

import java.util.ArrayList;

public class ListaDeItens implements Listavel<Item> {
    private ArrayList<Item> itens = new ArrayList<Item>();

    @Override
    public boolean salvar(Item dado) {
        if (!(dado == null)) {
            itens.add(dado);
            return true;
        } else
            return false;
    }

    @Override
    public boolean remover(int id) {
        for (Item item : itens) {
            if (item.getCodigo() == id) {
                itens.remove(item.getCodigo() - 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editar(Item dado) {
        if (!(dado == null)) {
            for (Item item : itens) {
                if (item.getCodigo() == dado.getCodigo()) {
                    item.setCodigo(dado.getCodigo());
                    item.setNome(dado.getNome());
                    item.setQuantidade(dado.getQuantidade());
                    item.setValorUnitario(dado.getValorUnitario());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Item consultar(int id) {
        for (Item item : itens) {
            if (item.getCodigo() == id)
                return item;
        }
        return null;
    }

    @Override
    public ArrayList<Item> consultarTodos() {
        return itens;
    }

}
