import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {
    static List<HashMap> lista = new ArrayList<HashMap>();
    public static void main(String[] args) {
        novoParticipante("felipe", "ticiani", 27, "48999290167", "nao", "O+", 1, "1");
        novoParticipante("maria", "silva", 17, "48999290167", "nao", "O+", 3, "1");
        novoParticipante("fernanda", "lopes", 16, "48999290167", "nao", "O+", 1, "1");

        for (HashMap participante : lista) {
            System.out.println("Matrícula: " + participante.get("matricula"));
            System.out.println("Nome: " + participante.get("nome"));
            System.out.println("Sobrenome: " + participante.get("sobrenome"));
            System.out.println("Idade: " + participante.get("idade"));
            System.out.println("RG: " + participante.get("rg"));
            System.out.println("Celular: " + participante.get("celular"));
            System.out.println("Número de emergência: " + participante.get("numEmergencia"));
            System.out.println("Grupo Sanguíneo: " + participante.get("grupoSanguineo"));
            System.out.println("Categoria: " + participante.get("categoria"));
            System.out.println("Valor: " + participante.get("valor"));
            System.out.println();
        }
        removerParticipante(1);
    }

    public static boolean novoParticipante(String nome, String sobrenome, int idade, String celular, String numEmergencia, String grupoSanguineo, int categoria, String rg) {
        if(idade < 18 && categoria == 3) {
            return false;
        } else {
            HashMap<String, String> participante = new HashMap<>();
            if (categoria == 1) {
                if (idade < 18) {
                    participante.put("valor", "R$ 1.300");
                } else {
                    participante.put("valor", "R$ 1.500");
                }
            }
            if (categoria == 2) {
                if (idade < 18) {
                    participante.put("valor", "R$ 2.000");
                } else {
                    participante.put("valor", "R$ 2.300");
                }
            }
            if (categoria == 3) {
                participante.put("valor", "R$ 2.300");
            }
            participante.put("nome", nome);
            participante.put("sobrenome", sobrenome);
            participante.put("idade", "" + idade);
            participante.put("celular", celular);
            participante.put("numEmergencia", numEmergencia);
            participante.put("grupoSanguineo", grupoSanguineo);
            participante.put("categoria", "" + categoria);
            participante.put("matricula", "" + (lista.size() + 1));
            participante.put("rg", rg);
            lista.add(participante);
            return true;
        }
    }
    public static void removerParticipante(int matricula) {
        lista.remove(matricula);
    }
}
