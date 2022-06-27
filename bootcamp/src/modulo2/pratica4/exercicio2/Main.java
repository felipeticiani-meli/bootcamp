package modulo2.pratica4.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Felipe", "12312312312", "48912341234");
        Curriculo curriculo = new Curriculo(pessoa1, new String[]{"Java", "Python"});
        Livro livro = new Livro(230, "Shakespeare", "Hamlet", "Teatro");
        Relatorio relatorio = new Relatorio("Texto do relatório...", "Felipe", "Maria", 12);

        Imprimir.imprimirDocumento(curriculo);
        Imprimir.imprimirDocumento(livro);
        Imprimir.imprimirDocumento(relatorio);
    }
}
