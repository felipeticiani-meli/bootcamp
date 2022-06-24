package mod2pratica3;

import java.util.ArrayList;
import java.util.Scanner;

public class Distribuidora {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Pereciveis("Leite",4.28,3));
        produtos.add(new Pereciveis("Carne moída kg",23.99,10));
        produtos.add(new NaoPereciveis("Arroz branco 1kg",3.78,"Grãos"));
        produtos.add(new NaoPereciveis("Feijão carioca 1kg",7.99,"Grãos"));
        produtos.add(new NaoPereciveis("Macarrão Penne",2.99, "Massas"));

        double valorTotal = 0;

        Scanner teclado = new Scanner(System.in);
        for (Produto produto : produtos) {
            System.out.println(produto);
            System.out.println("Informe a quantidade do produto " + produto.getNome());
            valorTotal+= produto.calcular(Integer.parseInt(teclado.nextLine()));
        }
        teclado.close();

        System.out.println("Valor total da compra: R$ " + valorTotal);
    }
}
