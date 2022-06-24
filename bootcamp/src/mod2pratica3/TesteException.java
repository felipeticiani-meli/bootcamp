package mod2pratica3;

public class TesteException {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int resultado = b / a;
        } catch (ArithmeticException err) {
            throw new IllegalArgumentException("Não pode ser dividido por zero.");
        } finally {
            System.out.println("Programa finalizado");
        }


    }
}
