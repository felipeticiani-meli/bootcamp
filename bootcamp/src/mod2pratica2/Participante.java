package mod2pratica2;

public class Participante {
    private String nome, sobrenome, celular, numEmergencia, grupoSanguineo, rg;
    private int idade, categoria, matricula;
    private double valor;

    public Participante(String nome, String sobrenome, String celular, String numEmergencia, String grupoSanguineo, String rg, int idade, int categoria, int matricula) {
        if(!(idade < 18) && !(categoria == 3)) {
            if (categoria == 1) {
                if (idade < 18) {
                    this.valor = 1300;
                } else {
                    this.valor = 1500;
                }
            }
            if (categoria == 2) {
                if (idade < 18) {
                    this.valor = 2000;
                } else {
                    this.valor = 2300;
                }
            }
            if (categoria == 3) {
                this.valor = 2800;
            }
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.celular = celular;
            this.numEmergencia = numEmergencia;
            this.grupoSanguineo = grupoSanguineo;
            this.rg = rg;
            this.idade = idade;
            this.categoria = categoria;
            this.matricula = matricula;
        }
    }

    @Override
    public String toString() {
        return "Matrícula: " + this.matricula + " | Nome: " + this.nome + " | Sobrenome: " + this.sobrenome +
                " | Idade: " + this.idade + " | RG: " + this.rg + " | Celular: " + this.celular +
                " | Número de emergência: " + this.numEmergencia + " | Grupo Sanguíneo: " + this.grupoSanguineo +
                " | Categoria: " + this.categoria + " | Valor: R$" + this.valor;
    }
}
