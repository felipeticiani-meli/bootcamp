package meli.bootcamp.joalheria.repository;

import meli.bootcamp.joalheria.model.Jewel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJewelRepo extends CrudRepository<Jewel, Long> {

    // using JPQL
    @Query(value = "select j from Jewel j order by j.material.name")
    List<Jewel> getAllOrderedByMaterial();

    // using MySQL (native)
    @Query(value = "SELECT * FROM jewel ORDER BY weight DESC LIMIT 1", nativeQuery = true)
    Jewel getHeaviestJewel();
}
