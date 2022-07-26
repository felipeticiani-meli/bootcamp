package meli.bootcamp.elastic.service;

import meli.bootcamp.elastic.model.Article;

import java.util.List;

public interface IArticleService {
    Article save(Article article);
    Article findById(long id);
    List<Article> findAll();
    List<Article> findByTitle(String search);
    List<Article> findByAuthor(String search);
    String deleteById(long id);
}
