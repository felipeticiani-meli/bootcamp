package meli.bootcamp.hibernate.controller;

import meli.bootcamp.hibernate.model.UserBD;
import meli.bootcamp.hibernate.service.UserBdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*") // pra aceitar requisições de qualquer domínio
public class UserBdController {

    @Autowired
    private UserBdService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserBD> buscaPorId(@PathVariable int id) {
        UserBD userFound = service.getUserById(id);

        if(userFound != null) {
            return ResponseEntity.ok(userFound);
        }
        return ResponseEntity.notFound().build();
    }
}
