package modulo2.pratica6;

import modulo2.pratica6.model.Cliente;
import modulo2.pratica6.model.Fatura;
import modulo2.pratica6.model.Item;
import modulo2.pratica6.util.ListaDeClientes;
import modulo2.pratica6.util.ListaDeItens;
import modulo2.pratica6.util.Listavel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // adicionando novos clientes
        ListaDeClientes clientes = new ListaDeClientes();
        clientes.salvar(new Cliente(1, "João", "Silva"));
        clientes.salvar(new Cliente(2, "Maria", "Fagundes"));
        clientes.salvar(new Cliente(3, "José", "Souza"));

        // removendo cliente
        if (clientes.remover(2))
            System.out.println("Cliente removido.");
        else
            System.out.println("Erro ao remover cliente.");

        // editando cliente
        if (clientes.editar(new Cliente(1, "João Pedro", "Silva")))
            System.out.println("Cliente editado.");
        else
            System.out.println("Erro ao editar cliente.");

        // lendo input do usuário
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ID do cliente para buscar: ");
        int idBuscado = Integer.parseInt(teclado.nextLine());
        Cliente clienteBuscado = clientes.consultar(idBuscado);

        // buscando cliente
        if (clienteBuscado == null)
            System.out.println("Cliente não encontrado!");
        else
            System.out.println("Cliente encontrado:\n" + clienteBuscado.getNome() + " " + clienteBuscado.getSobrenome() + " " + clienteBuscado.getId());

        // buscando todos os clientes armazenados
        ArrayList<Cliente> todosClientes = clientes.consultarTodos();
        todosClientes.forEach(cliente -> System.out.println(cliente.getNome() + " " + cliente.getSobrenome() + " " + cliente.getId()));

        // adicionando novos itens
        ListaDeItens listaDeItens = new ListaDeItens();
        listaDeItens.salvar(new Item(1, 2, "Arroz", 4.00));
        listaDeItens.salvar(new Item(2, 1, "Feijão", 5.00));
        listaDeItens.salvar(new Item(3, 1, "Macarrão", 2.00));

        // consultando todos os itens e removendo
        ArrayList<Item> todosItens = listaDeItens.consultarTodos();
        todosItens.forEach(item -> System.out.println(item.getNome()));
        listaDeItens.remover(2);
        todosItens = listaDeItens.consultarTodos();
        todosItens.forEach(item -> System.out.println(item.getNome()));

        // editando um item e o consultando
        listaDeItens.editar(new Item(1, 2, "Arroz Branco", 4.00));
        Item itemBuscado = listaDeItens.consultar(1);
        System.out.println(itemBuscado.getNome());

        // criando uma fatura
        System.out.println("Digite o ID do cliente para a fatura: ");
        idBuscado = Integer.parseInt(teclado.nextLine());
        clienteBuscado = clientes.consultar(idBuscado);
        Fatura fatura;
        if (clienteBuscado == null)
            System.out.println("Cliente não encontrado! Crie o cliente primeiro.");
        else {
            fatura = new Fatura(clienteBuscado, listaDeItens);
            System.out.println(fatura.getCliente().getNome() + " R$ " + fatura.getValorTotal());
        }
    }

}
