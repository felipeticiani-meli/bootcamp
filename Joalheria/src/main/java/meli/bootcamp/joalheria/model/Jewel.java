package meli.bootcamp.joalheria.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import meli.bootcamp.joalheria.dto.JewelRequestDto;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Jewel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "material_id", referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties("jewels")
    private Material material;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private double carat;
}
