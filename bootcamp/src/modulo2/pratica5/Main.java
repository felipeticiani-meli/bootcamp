package modulo2.pratica5;

import modulo2.pratica5.model.Garagem;
import modulo2.pratica5.model.Veiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
        listaDeVeiculos.add(new Veiculo("Fiesta", "Ford", 1000));
        listaDeVeiculos.add(new Veiculo("Focus", "Ford", 1200));
        listaDeVeiculos.add(new Veiculo("Explorer", "Ford", 2500));
        listaDeVeiculos.add(new Veiculo("Uno", "Fiat", 500));
        listaDeVeiculos.add(new Veiculo("Cronos", "Fiat", 1000));
        listaDeVeiculos.add(new Veiculo("Torino", "Fiat", 1250));
        listaDeVeiculos.add(new Veiculo("Aveo", "Chevrolet", 1250));
        listaDeVeiculos.add(new Veiculo("Spin", "Chevrolet", 2500));
        listaDeVeiculos.add(new Veiculo("Corola", "Toyota", 1200));
        listaDeVeiculos.add(new Veiculo("Fortuner", "Toyota", 3000));
        listaDeVeiculos.add(new Veiculo("Logan", "Renault", 950));

        Garagem garagem = new Garagem(1, listaDeVeiculos);

        listaDeVeiculos.sort((a, b) -> Double.compare(a.getPreco(), b.getPreco()));
        listaDeVeiculos.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPreco()));

        System.out.println();
        listaDeVeiculos.sort((a, b) -> CharSequence.compare(a.getMarca(), b.getMarca()));
        listaDeVeiculos.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPreco()));

        System.out.println();
        listaDeVeiculos.forEach(v -> {
            if (v.getPreco() <= 1000) System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPreco());
        });

        System.out.println();
        listaDeVeiculos.forEach(v -> {
            if (v.getPreco() >= 1000) System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPreco());
        });

        System.out.println("\nMédia: R$ " + listaDeVeiculos.stream().mapToDouble(v -> v.getPreco()).average().getAsDouble());

    }
}
