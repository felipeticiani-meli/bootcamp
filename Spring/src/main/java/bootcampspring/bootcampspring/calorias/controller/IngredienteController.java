package bootcampspring.bootcampspring.calorias.controller;

import bootcampspring.bootcampspring.calorias.model.Ingrediente;
import bootcampspring.bootcampspring.calorias.repository.IngredienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calorias/ingredientes")
public class IngredienteController {

    @Autowired
    private IngredienteRepo ingredienteRepo;

    @GetMapping("/all")
    public ResponseEntity<List<Ingrediente>> getAll() {
        return ResponseEntity.ok(ingredienteRepo.getAll());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Ingrediente> getIngrediente(@PathVariable String name) {
        return ResponseEntity.ok(ingredienteRepo.getFirstByName(name));
    }

    @GetMapping("/all/{name}")
    public ResponseEntity<List<Ingrediente>> getListaIngrediente(@PathVariable String name) {
        return ResponseEntity.ok(ingredienteRepo.getListByName(name));
    }

}
