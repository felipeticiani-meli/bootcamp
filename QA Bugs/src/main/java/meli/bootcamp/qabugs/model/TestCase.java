package meli.bootcamp.qabugs.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter @Setter
@Entity
public class TestCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCase;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean tested;

    @Column(nullable = false)
    private boolean passed;

    @Column(nullable = false)
    private int numberOfTries;

    @Column(nullable = false)
    private LocalDate lastUpdate;
}
