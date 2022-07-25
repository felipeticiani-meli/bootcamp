package meli.bootcamp.joalheria.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class JewelRequestDto {
    private Long id;
    private Long material;
    private double weight;
    private double carat;
}
