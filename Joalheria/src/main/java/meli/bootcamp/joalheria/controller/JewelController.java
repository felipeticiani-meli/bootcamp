package meli.bootcamp.joalheria.controller;

import meli.bootcamp.joalheria.dto.JewelRequestDto;
import meli.bootcamp.joalheria.model.Jewel;
import meli.bootcamp.joalheria.service.IJewelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jewelry")
public class JewelController {

    @Autowired
    private IJewelService service;

    @PostMapping("/jewel/insert")
    public ResponseEntity<Jewel> createJewel(@RequestBody JewelRequestDto newJewel) {
        if (newJewel.getId() != null )
            return ResponseEntity.badRequest().build();
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createJewel(newJewel));
    }

    @GetMapping("/jewels")
    public ResponseEntity<List<Jewel>> getAllJewels() {
        return ResponseEntity.ok(service.getAllJewels());
    }

    @GetMapping("/jewels/material")
    public ResponseEntity<List<Jewel>> getAllOrderedByMaterial() {
        return ResponseEntity.ok(service.getAllOrderedByMaterial());
    }

    @GetMapping("/jewel")
    public ResponseEntity<Jewel> getJewelById(@RequestParam Long id) {
        Optional<Jewel> foundJewel = service.getById(id);
        if (foundJewel.isPresent())
            return ResponseEntity.ok(foundJewel.get());
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/jewels/heaviest")
    public ResponseEntity<Jewel> getHeaviestJewel() {
        return ResponseEntity.ok(service.getHeaviestJewel());
    }

    @DeleteMapping("/jewel/delete")
    public ResponseEntity<Void> deleteJewel(@RequestParam Long id) {
        Optional<Jewel> foundJewel = service.getById(id);

        if (foundJewel.isPresent()) {
            service.deleteJewel(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/jewel/update")
    public ResponseEntity<Jewel> updateJewel(@RequestBody Jewel jewel) {
        Optional<Jewel> foundJewel = service.getById(jewel.getId());

        if (foundJewel.isPresent()) {
            service.updateJewel(jewel);
            return ResponseEntity.ok(jewel);
        }
        return ResponseEntity.notFound().build();
    }
}
