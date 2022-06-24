package mod2pratica3;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double resultado = super.calcular(quantidadeDeProdutos);
        if (diasParaVencer == 1)
            return resultado / 4;
        else if (diasParaVencer == 2)
            return resultado / 3;
        else if (diasParaVencer == 3)
            return resultado / 2;
        return resultado;
    }
}
