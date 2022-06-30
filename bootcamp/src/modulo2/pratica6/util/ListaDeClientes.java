package modulo2.pratica6.util;

import modulo2.pratica6.model.Cliente;

import java.util.ArrayList;

public class ListaDeClientes implements Listavel<Cliente> {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    @Override
    public boolean salvar(Cliente dado) {
        if (!(dado == null)) {
            clientes.add(dado);
            return true;
        } else
            return false;
    }

    @Override
    public boolean remover(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente.getId() - 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editar(Cliente dado) {
        if (!(dado == null)) {
            for (Cliente cliente : clientes) {
                if (cliente.getId() == dado.getId()) {
                    cliente.setId(dado.getId());
                    cliente.setNome(dado.getNome());
                    cliente.setSobrenome(dado.getSobrenome());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Cliente consultar(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id)
                return cliente;
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> consultarTodos() {
        return clientes;
    }
}
