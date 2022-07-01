package bootcampspring.bootcampspring.morse;

import java.util.Map;
import static java.util.Map.entry;

public class ConversorMorse {
    private static final Map<String, String> dicionarioMorse = Map.ofEntries(
            entry(".-", "A"),
            entry("-...", "B"),
            entry("-.-.", "C"),
            entry("-..", "D"),
            entry(".", "E"),
            entry("..-.", "F"),
            entry("--.", "G"),
            entry("....", "H"),
            entry("..", "I"),
            entry(".---", "J"),
            entry("-.-", "K"),
            entry(".-..", "L"),
            entry("--", "M"),
            entry("-.", "N"),
            entry("---", "O"),
            entry(".--.", "P"),
            entry("--.-", "Q"),
            entry(".-.", "R"),
            entry("...", "S"),
            entry("-", "T"),
            entry("..-", "U"),
            entry("...-", "V"),
            entry(".--", "W"),
            entry("-..-", "X"),
            entry("-.--", "Y"),
            entry("--..", "Z"),
            entry(".----", "1"),
            entry("..---", "2"),
            entry("...--", "3"),
            entry("....-", "4"),
            entry(".....", "5"),
            entry("-....", "6"),
            entry("--...", "7"),
            entry("---..", "8"),
            entry("----.", "9"),
            entry("-----", "0"),
            entry("..--..", "?"),
            entry("-.-.--", "!"),
            entry(".-.-.-", "."),
            entry("--..--", ","),
            entry(" ", "")
    );

    public static String morseParaTexto(String morse) {
        StringBuilder texto = new StringBuilder();
        String[] arrayMorse = morse.split("\\s");
        for(String m : arrayMorse) {
            String caracter = dicionarioMorse.get(m);
            if(caracter == null) {
                texto.append(" ");
            } else {
                texto.append(caracter);
            }
        }
        return texto.toString().replace("  ", " ");
    }
}
