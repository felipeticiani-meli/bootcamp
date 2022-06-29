package modulo2.pratica6;

import modulo2.pratica6.model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente(1, "João", "Silva"));
        clientes.add(new Cliente(2, "Maria", "Fagundes"));
        clientes.add(new Cliente(3, "José", "Souza"));

        clientes.forEach(c -> System.out.println(c.getNome() + " " + c.getSobrenome() + " " + c.getId()));
        clientes.remove(1);
        System.out.println();
        clientes.forEach(c -> System.out.println(c.getNome() + " " + c.getSobrenome() + " " + c.getId()));

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ID do cliente para buscar: ");
        int idBuscado = Integer.parseInt(teclado.nextLine());
        Cliente clienteBuscado = buscaCliente(idBuscado, clientes);

        if (clienteBuscado == null)
            System.out.println("Cliente não encontrado!");
        else
            System.out.println("\nCliente encontrado:\n" + clienteBuscado.getNome() + " " + clienteBuscado.getSobrenome() + " " + clienteBuscado.getId());
    }

    public static Cliente buscaCliente(int idBuscado, ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idBuscado)
                return cliente;
        }
        return null;
    }
}
