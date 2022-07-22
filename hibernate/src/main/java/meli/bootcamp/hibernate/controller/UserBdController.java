package meli.bootcamp.hibernate.controller;

import meli.bootcamp.hibernate.model.UserBD;
import meli.bootcamp.hibernate.service.IUserBdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin("*") // pra aceitar requisições de qualquer domínio
public class UserBdController {

    @Autowired
    private IUserBdService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserBD> buscaPorId(@PathVariable int id) {
        Optional<UserBD> userFound = service.getUserById(id);

        if(userFound.isPresent()) {
            return ResponseEntity.ok(userFound.get());
        }
        return ResponseEntity.notFound().build();
    }
}
