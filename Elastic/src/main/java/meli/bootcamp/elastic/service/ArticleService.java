package meli.bootcamp.elastic.service;

import meli.bootcamp.elastic.model.Article;
import meli.bootcamp.elastic.repository.IArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private IArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public Article findById(long id) {
        return repo.findById(id).get();
    }
}
