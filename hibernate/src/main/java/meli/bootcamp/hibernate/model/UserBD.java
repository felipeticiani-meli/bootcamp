package meli.bootcamp.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity // indica que é uma entidade do BD
@Table(name = "user") // define qual o nome da tabela no BD
public class UserBD {

    @Id // define que é a PK da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // define o AUTO_INCREMENT
    private int id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;
}
