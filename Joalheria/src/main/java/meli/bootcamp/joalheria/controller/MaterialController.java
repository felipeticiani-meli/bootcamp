package meli.bootcamp.joalheria.controller;

import meli.bootcamp.joalheria.model.Jewel;
import meli.bootcamp.joalheria.model.Material;
import meli.bootcamp.joalheria.service.IMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/jewelry/material")
public class MaterialController {

    @Autowired
    private IMaterialService service;

    @PostMapping("/insert")
    public ResponseEntity<Material> createMaterial(@RequestBody Material newMaterial) {
        if (newMaterial.getId() != null )
            return ResponseEntity.badRequest().build();
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createMaterial(newMaterial));
    }

    @GetMapping()
    public ResponseEntity<Material> getById(@RequestParam Long id) {
        Optional<Material> foundMaterial = service.getById(id);
        if (foundMaterial.isPresent())
            return ResponseEntity.ok(foundMaterial.get());
        return ResponseEntity.notFound().build();
    }
}
