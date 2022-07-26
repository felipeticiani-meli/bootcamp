package meli.bootcamp.elastic.controller;

import meli.bootcamp.elastic.model.Article;
import meli.bootcamp.elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping()
    public ResponseEntity<Page<Article>> findAll(Pageable pg) {
        System.out.println(pg.getSort());
        return ResponseEntity.ok(service.findAll(pg));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping(params = "title")
    public ResponseEntity<Page<Article>> findByTitle(@RequestParam String title, Pageable pg) {
        return ResponseEntity.ok(service.findByTitle(title, pg));
    }

    @GetMapping(params = "author")
    public ResponseEntity<List<Article>> findByAuthor(@RequestParam String author) {
        return ResponseEntity.ok(service.findByAuthor(author));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(service.deleteById(id));
    }
}
