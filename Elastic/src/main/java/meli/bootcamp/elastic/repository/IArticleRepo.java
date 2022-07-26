package meli.bootcamp.elastic.repository;

import meli.bootcamp.elastic.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

// não precisamos do @Repository porque já definimos a localização em Config
public interface IArticleRepo extends ElasticsearchRepository<Article, Long> {
}
