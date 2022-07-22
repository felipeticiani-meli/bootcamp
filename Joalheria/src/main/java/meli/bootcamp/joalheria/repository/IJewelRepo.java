package meli.bootcamp.joalheria.repository;

import meli.bootcamp.joalheria.model.Jewel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJewelRepo extends CrudRepository<Jewel, Long> {

}
