package meli.bootcamp.elastic.repository;

import meli.bootcamp.elastic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

// não precisamos do @Repository porque já definimos a localização em Config
public interface IArticleRepo extends ElasticsearchRepository<Article, Long> {
    List<Article> findByAuthors_NameContaining(String search);

    // Customizando uma query
    @Query("{\"match_all\": {} }")
    Page<Article> findAllArticles(Pageable pg);

    // query com paginação
    Page<Article> findByTitleContaining(String title, Pageable pg);
}
