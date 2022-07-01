package bootcampspring.bootcampspring.romanos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/romanos")
public class RomanosController {

    @GetMapping("/{numDecimal}")
    public String romanos(@PathVariable int numDecimal) {
        return ConversorRomano.decimalParaRomano(numDecimal);
    }
}
