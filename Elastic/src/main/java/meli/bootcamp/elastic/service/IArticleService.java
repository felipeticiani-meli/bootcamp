package meli.bootcamp.elastic.service;

import meli.bootcamp.elastic.model.Article;

public interface IArticleService {
    Article save(Article article);
    Article findById(long id);
}
