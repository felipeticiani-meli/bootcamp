package meli.bootcamp.elastic.service;

import meli.bootcamp.elastic.model.Article;
import meli.bootcamp.elastic.repository.IArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
    public Page<Article> findAll(Pageable pg) {
        /*
        Usando o método de ElasticsearchRepository
        List<Article> articles = new ArrayList<>();
        repo.findAll().forEach(articles::add);
        return articles;
        */

        return repo.findAllArticles(pg);
    }

    @Override
    public Page<Article> findByTitle(String search, Pageable pg) {
        return repo.findByTitleContaining(search, pg);
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
