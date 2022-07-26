package meli.bootcamp.elastic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

// @Document define que é um documento
@Document(indexName = "meli_bootcamp_elastic")
@Getter @Setter
public class Article {
    // @Id para definirmos que é o id do objeto
    // O tipo é String para que o Elastic crie automaticamente
    @Id
    private String id;

    // FieldType para setarmos o tipo do campo, se quisermos
    @Field(type = FieldType.Keyword)
    private String title;

    // Nested: tipo de campo embutido (vem de outra classe)
    // includeInParent: para guardar dentro do objeto Article
    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Author> authors;
}
