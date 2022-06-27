package modulo2.pratica2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Participante> lista = new ArrayList<>();
        int ultimaMatricula = 0;
        int opcao;
        do {
            String nome = javax.swing.JOptionPane.showInputDialog("Digite o nome do participante.");
            String sobrenome = javax.swing.JOptionPane.showInputDialog("Digite o sobrenome do participante.");
            int idade = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite a idade do participante."));
            String rg = javax.swing.JOptionPane.showInputDialog("Digite o RG do participante.");
            String celular = javax.swing.JOptionPane.showInputDialog("Digite o celular do participante.");
            String numEmergencia = javax.swing.JOptionPane.showInputDialog("Digite o número de emergência do participante.");
            String grupoSanguineo = javax.swing.JOptionPane.showInputDialog("Digite o grupo sanguíneo do participante.");
            int categoria = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite a categoria do participante." +
                    "1 - Circuito Pequeno | 2 - Circuito Médio | 3 - Circuito Avançado"));
            ultimaMatricula++;
            Participante participante = new Participante(nome, sobrenome, celular, numEmergencia, grupoSanguineo, rg, idade, categoria, ultimaMatricula);
            lista.add(participante);
            opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite qualquer valor para sair ou 1 para cadastrar um novo participante."));
        } while (opcao == 1);

        for (Participante participante : lista) {
            System.out.println(participante);
        }

        lista.remove(0);

        for (Participante participante : lista) {
            System.out.println(participante);
        }
    }
}
