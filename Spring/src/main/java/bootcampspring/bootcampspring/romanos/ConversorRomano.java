package bootcampspring.bootcampspring.romanos;

import java.util.Collections;
import static java.lang.String.join;

public abstract class ConversorRomano {
    private static final int[] DECIMAIS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String decimalParaRomano(int numDecimal) {
        StringBuilder numRomano = new StringBuilder();
        for (int i = 0; i < DECIMAIS.length; i++) {
            int parteInteira = numDecimal / DECIMAIS[i];
            numDecimal -= DECIMAIS[i] * parteInteira;
            numRomano.append(join("", Collections.nCopies(parteInteira, ROMANOS[i])));
        }
        return numRomano.toString();
    }
}
