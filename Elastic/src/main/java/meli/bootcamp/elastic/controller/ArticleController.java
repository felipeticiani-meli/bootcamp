package meli.bootcamp.elastic.controller;

import meli.bootcamp.elastic.model.Article;
import meli.bootcamp.elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article newArticle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(newArticle));
    }

    @GetMapping
    public ResponseEntity<List<Article>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping(params = "title")
    public ResponseEntity<List<Article>> findByTitle(@RequestParam String title) {
        return ResponseEntity.ok(service.findByTitle(title));
    }

    @GetMapping(params = "author")
    public ResponseEntity<List<Article>> findByAuthor(@RequestParam String author) {
        return ResponseEntity.ok(service.findByAuthor(author));
    }
}
