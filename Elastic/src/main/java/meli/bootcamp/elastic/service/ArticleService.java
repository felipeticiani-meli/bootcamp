package meli.bootcamp.elastic.service;

import meli.bootcamp.elastic.model.Article;
import meli.bootcamp.elastic.repository.IArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Article> findAll() {
        List<Article> articles = new ArrayList<>();
        repo.findAll().forEach(articles::add);
        return articles;
    }

    @Override
    public List<Article> findByTitle(String search) {
        return repo.findByTitleContaining(search);
    }

    @Override
    public List<Article> findByAuthor(String search) {
        return repo.findByAuthors_NameContaining(search);
    }

    @Override
    public String deleteById(long id) {
        repo.deleteById(id);
        return "Removed!";
    }
}
