package meli.bootcamp.joalheria.controller;

import meli.bootcamp.joalheria.model.Jewel;
import meli.bootcamp.joalheria.service.IJewelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jewelry")
public class JewelController {

    @Autowired
    private IJewelService service;

    @PostMapping("/jewel/insert")
    public ResponseEntity<Jewel> createJewel(@RequestBody Jewel newJewel) {
        if (newJewel.getId() != null )
            return ResponseEntity.badRequest().build();
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createJewel(newJewel));
    }

    @GetMapping("/jewels")
    public ResponseEntity<List<Jewel>> getAllJewels() {
        return ResponseEntity.ok(service.getAllJewels());
    }
}
