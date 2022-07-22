package meli.bootcamp.joalheria.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table
public class Jewel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String material;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private double carat;
}
