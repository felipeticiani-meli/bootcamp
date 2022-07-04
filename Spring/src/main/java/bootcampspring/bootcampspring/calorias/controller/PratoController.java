package bootcampspring.bootcampspring.calorias.controller;

import bootcampspring.bootcampspring.calorias.model.Ingrediente;
import bootcampspring.bootcampspring.calorias.model.Prato;
import bootcampspring.bootcampspring.calorias.repository.PratoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/calorias/pratos")
public class PratoController {
    @Autowired
    private PratoRepo pratoRepo;

    @GetMapping("/all")
    public ResponseEntity<List<Prato>> getAll() {
        return ResponseEntity.ok(pratoRepo.getAll());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Prato> getPrato(@PathVariable String name) {
        Prato prato = pratoRepo.getFirstByName(name);
        if (prato != null)
            return ResponseEntity.ok(prato);
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all/{name}")
    public ResponseEntity<List<Prato>> getListaPrato(@PathVariable String name) {
        List<Prato> lista = pratoRepo.getListByName(name);
        if (lista != null)
            return ResponseEntity.ok(lista);
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{name}/total-calories")
    public String getTotalCalories(@PathVariable String name) {
        String retorno = pratoRepo.getTotalCalories(name);
        if (retorno != null)
            return retorno;
        return null;
    }

    @GetMapping("/{name}/highest-calorie")
    public ResponseEntity<Ingrediente> getHighestCalorie(@PathVariable String name) {
        Ingrediente ingrediente = pratoRepo.getHighestCalorie(name);
        if (ingrediente != null)
            return ResponseEntity.ok(ingrediente);
        return ResponseEntity.notFound().build();
    }

}
