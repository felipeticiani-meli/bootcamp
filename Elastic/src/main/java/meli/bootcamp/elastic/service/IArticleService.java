package meli.bootcamp.elastic.service;

import meli.bootcamp.elastic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticleService {
    Article save(Article article);
    Article findById(long id);
    Page<Article> findAll(Pageable pg);
    Page<Article> findByTitle(String search, Pageable pg);
    List<Article> findByAuthor(String search);
    String deleteById(long id);
}
