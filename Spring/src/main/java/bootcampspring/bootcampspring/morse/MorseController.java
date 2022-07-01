package bootcampspring.bootcampspring.morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @GetMapping("/{codMorse}")
    public String morse(@PathVariable String codMorse) {
        return ConversorMorse.morseParaTexto(codMorse);
    }
}
