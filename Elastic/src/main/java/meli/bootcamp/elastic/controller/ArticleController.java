package meli.bootcamp.elastic.controller;

import meli.bootcamp.elastic.model.Article;
import meli.bootcamp.elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article newArticle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(newArticle));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
